package com.skcc.plugin.corus.actions;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.event.EditorFactoryEvent;
import com.intellij.openapi.editor.event.EditorFactoryListener;
import com.intellij.openapi.editor.markup.HighlighterLayer;
import com.intellij.openapi.editor.markup.HighlighterTargetArea;
import com.intellij.openapi.editor.markup.MarkupModel;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.util.TextRange;
import com.intellij.ui.JBColor;

import com.skcc.plugin.corus.configs.Codes;
import com.skcc.plugin.corus.configs.Globals;
import com.skcc.plugin.corus.notifications.Notifier;
import com.skcc.plugin.corus.request.Prompt;
import com.skcc.plugin.corus.request.UserResponse;
import com.skcc.plugin.corus.response.AICodingResponse;
import com.skcc.plugin.corus.utils.FileUtils;
import com.skcc.plugin.corus.utils.HttpUtils;
import com.skcc.plugin.corus.utils.StringUtils;
import org.jetbrains.annotations.NotNull;

import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.CompletableFuture;

import static com.skcc.plugin.corus.configs.Configs.*;

public class CorusEditorFactoryListener implements EditorFactoryListener {

    final Timer timer;
    Project currentProject;
    final Map<String, Editor> editorList = new java.util.HashMap<>();
    String currentFileName;
    MarkupModel currentMarkupModel;
    TextRange currentTextRange;
    String currentSuggestionText;
    AICodingResponse currentResponse;
    static CorusEditorFactoryListener instance;

    Globals globals = Globals.getInstance();

    boolean inlineSuggestionEnabled = false;    // true: inline suggestion 허용, false: inline suggestion 금지
    private void setInlineSuggestionEnabled(boolean flag) {inlineSuggestionEnabled = flag;}

    boolean completionEnabled = true;           // true: completion 요청 허용, false: completion 요청 금지

    final Set<Integer> keysForAccept = new HashSet<>(Arrays.asList(KeyEvent.VK_RIGHT, KeyEvent.VK_DOWN, KeyEvent.VK_END, KeyEvent.VK_PAGE_DOWN));
    final Set<Integer> keysForCancel = new HashSet<>(Arrays.asList(KeyEvent.VK_ESCAPE, KeyEvent.VK_LEFT, KeyEvent.VK_UP, KeyEvent.VK_HOME, KeyEvent.VK_PAGE_UP, KeyEvent.VK_ENTER));

    public CorusEditorFactoryListener() {
        instance = this;
        timer = new Timer(TIMER_DELAY, e -> {
            if (completionEnabled) ApplicationManager.getApplication().invokeLater(this::getCompletions);
        });
        timer.setRepeats(false);
    }

    public static CorusEditorFactoryListener getInstance() { return instance; }

    private String getCurFile() { return currentFileName; }

    private void setCurFile() { currentFileName = FileUtils.getFileName(getProject()); }

    private Editor getEditor() { return editorList.get(getCurFile()); }

    private void addEditor(Editor editor) { editorList.put(StringUtils.extractFileName(editor.toString()), editor); }

    private Project getProject() {
        try {
            if (currentProject == null) currentProject = ProjectManager.getInstance().getOpenProjects()[0];
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return currentProject;
    }

    private void resetTimer() {
        if (globals.autoCodeCompletion) {
            globals.isProcessing = Boolean.FALSE;
            setInlineSuggestionEnabled(false);    // 커서 이동, 키 입력 등으로 인해 기 요청한 completion 결과를 취소하기 위한 설정
            timer.restart();
        }
    }

    public String getSuggestion() { return (currentSuggestionText != null) ? currentSuggestionText : ""; }

    private TextRange getTextRange() { return currentTextRange; }

    private void setTextRange(TextRange textRange) { currentTextRange = textRange; }

    @Override
    public void editorCreated(@NotNull EditorFactoryEvent event) {
        Editor editor = event.getEditor();
        addEditor(event.getEditor());   // `Editor`가 새로 열릴 때 마다, `Editor`를 리스트에 추가합니다.

        editor.getContentComponent().addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                // 포커싱 된 에디터의 파일명을 저장
                setCurFile();
                // 선택된 에디터가 빈 화면일 때, 자동완성을 실행합니다.
                if (getEditor() != null && getEditor().getDocument().getText().isEmpty()) resetTimer();
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                deleteSuggestion(null);
            }
        });

        // Key 입력에 대한 이벤트 리스너 등록
        editor.getContentComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!getSuggestion().isEmpty()) {
                    if (e.getKeyChar() == getSuggestion().charAt(0)) acceptSuggestion(e);
                    // Esc 등이 눌러졌을 때를 제거하기 위한 로직
                    else if (Character.isLetter(e.getKeyChar())) deleteSuggestion(e);
                } else {
                    resetTimer();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!getSuggestion().isEmpty()) {
                    if (keysForAccept.contains(e.getKeyCode())) acceptSuggestion(e);
                    else if (keysForCancel.contains(e.getKeyCode())) deleteSuggestion(e);

                    if (!globals.autoCodeCompletion) deleteSuggestion(null);
                } else {
                    if (Character.isLetter(e.getKeyChar())) resetTimer();
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) resetTimer();
                }
            }
        });

        // 마우스 입력에 대한 이벤트 리스너 등록
        editor.getContentComponent().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!getSuggestion().isEmpty()) deleteSuggestion(null);
            }
        });

        // 코드자동추천 on/off 시 기존 추천 내용 클리어
        ApplicationManager.getApplication().invokeLater(() -> globals.addValueChangeListener(newValue -> deleteSuggestion(null)));
    }

    @Override
    public void editorReleased(@NotNull EditorFactoryEvent event) { deleteSuggestion(null); }

    public void getCompletions() {
        globals.setProcessingOn();

        completionEnabled = false;  // completion 요청이 진행 중임을 표시
        setInlineSuggestionEnabled(true); // inline suggestion 허용

        try {
            int offset = getEditor().getCaretModel().getOffset();

            // 현재 커서부터 앞쪽의 코드를 읽어옵니다.
            int startOffset = Math.max(0, offset - TOKEN_LENGTH);
            TextRange rangeToReadBefore = new TextRange(startOffset, offset);
            String beforeCode = getEditor().getDocument().getText(rangeToReadBefore);

            // 현재 커서부터 뒤쪽의 코드를 읽어옵니다.
            int endOffset = Math.min(getEditor().getDocument().getTextLength(), offset + TOKEN_LENGTH);
            TextRange rangeToReadAfter = new TextRange(offset, endOffset);
            String afterCode = getEditor().getDocument().getText(rangeToReadAfter);

            // 서버에 요청하여 추천 코드를 받아옵니다.
            Prompt prompt = new Prompt(FileUtils.getFileName(getProject()), "", beforeCode, afterCode);
            CompletableFuture<AICodingResponse> futureResponse = HttpUtils.postCodeCompletionsAsync(prompt);
            futureResponse.thenAcceptAsync(aiCodingResponse -> {
                if (aiCodingResponse.getCode() == Codes.SUCCESS) {
                    currentResponse = aiCodingResponse;
                    setSuggestion(Objects.requireNonNull(aiCodingResponse).getData().get(0).getText(), offset);
                    globals.setProcessingOff();
                } else {
                    clearSuggestion();
                    setInlineSuggestionEnabled(true);
                }
            });
        } catch (NullPointerException e) {
            Notifier.showMessage(getProject(), e.getMessage(), false);
            clearSuggestion();
        }
    }

    private void clearSuggestion() {
        try {
            if (currentMarkupModel != null) currentMarkupModel.removeAllHighlighters();
            if (currentTextRange != null) currentTextRange = null;
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            globals.setProcessingOff();
            currentSuggestionText = "";
            completionEnabled = true;   // 새로운 completion 요청이 가능하도록 설정
            //currentResponse = null;   // 확인 필요!!! 키 입력 시 `null`이 되는 경우 발생.
        }
    }

    /**
     * 사용자가 추천 코드를 수락했을 때, 추천 코드를 반영 여부를 시스템으로 전송하는 함수
     */
    private void sendUserResponse() {
        if (currentResponse != null) {
            HttpUtils.postUserResponseAsync(new UserResponse(currentResponse.getResponseId(), currentResponse.getData().get(0).getText()));
        }
        else {
            System.out.println("currentResponse is null");
        }
    }

    /**
     * 탭 키가 눌러졌을 때, 전체 추천 코드를 반영하기 위한 함수
     */
    public void setAllSuggestion() {
        // Move to the end of the suggestion
        {
            CaretModel caretModel = getEditor().getCaretModel();
            Caret primaryCaret = caretModel.getPrimaryCaret();
            int currentOffset = primaryCaret.getOffset();
            int suggestionLength = currentSuggestionText.length();
            int newOffset = currentOffset + suggestionLength;
            primaryCaret.moveToOffset(newOffset);
        }
        // Accept 전송
        sendUserResponse();
        // 초기화
        clearSuggestion();
    }

    private void setSuggestion(String suggestionText, int offset) {
        if (suggestionText.isEmpty() || !inlineSuggestionEnabled || !globals.autoCodeCompletion) {
            if (suggestionText.isEmpty()) sendUserResponse();   // 추천 코드가 전부 반영된 경우이므로, Accept 전송
            clearSuggestion();
            resetTimer();   // 다음 추천이 가능하도록 타이머를 초기화
            return;
        }
        WriteCommandAction.runWriteCommandAction(getProject(), () -> {
            try {
                currentSuggestionText = suggestionText;
                currentTextRange = new TextRange(offset, offset + suggestionText.length());
                Document document = getEditor().getDocument();
                document.insertString(offset, getSuggestion());

                // 텍스트 스타일 설정
                TextAttributes textAttributes = new TextAttributes();
                textAttributes.setFontType(Font.ITALIC);
                textAttributes.setForegroundColor(JBColor.GRAY);

                // 하이라이터 생성 및 스타일 지정
                if (currentMarkupModel != null) currentMarkupModel.removeAllHighlighters();

                currentMarkupModel = getEditor().getMarkupModel();
                currentMarkupModel.addRangeHighlighter(
                        offset, offset + suggestionText.length(),
                        HighlighterLayer.SELECTION - 1,
                        textAttributes,
                        HighlighterTargetArea.EXACT_RANGE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


    private void acceptSuggestion(KeyEvent e) {
        WriteCommandAction.runWriteCommandAction(getProject(), () -> {
            try {
                int startOffset = getTextRange().getStartOffset();
                int endOffset = getTextRange().getEndOffset();
                int cursorPosition = getEditor().getCaretModel().getOffset();

                if (keysForCancel.contains(e.getKeyCode())) {
                    deleteSuggestion(e);
                } else if (keysForAccept.contains(e.getKeyCode())) {
                    String newSuggestion = getSuggestion().substring(cursorPosition - startOffset);
                    setTextRange(new TextRange(cursorPosition, endOffset));
                    deleteSuggestion(null);
                    setSuggestion(newSuggestion, cursorPosition);
                } else if (e.getKeyChar() == getSuggestion().charAt(0)) {
                    Document document = getEditor().getDocument();
                    document.deleteString(cursorPosition, cursorPosition + 1);
                    String newSuggestion = getSuggestion().substring(cursorPosition - startOffset);
                    setTextRange(new TextRange(cursorPosition, endOffset));
                    deleteSuggestion(null);
                    setSuggestion(newSuggestion, cursorPosition);
                } else if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    deleteSuggestion(null);
                } else {
                    deleteSuggestion(e);
                }
            } catch (Exception ex) {
                deleteSuggestion(e);
            }
        });
    }

    public void deleteSuggestion(KeyEvent e) {
        WriteCommandAction.runWriteCommandAction(getProject(), () -> {
            try {
                if (!getSuggestion().isEmpty()) {
                    int startOffset = getTextRange().getStartOffset();
                    int endOffset = getTextRange().getEndOffset();

                    if (e != null) {
                        if (keysForCancel.contains(e.getKeyCode())) {
                            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                startOffset = getEditor().getCaretModel().getOffset();
                                int gap = (startOffset - getEditor().getCaretModel().getVisualLineStart()) + "\n".length();
                                endOffset = getTextRange().getEndOffset() + gap;
                            }
                        } else {
                            startOffset = getEditor().getCaretModel().getOffset();
                            int gap = 1;
                            endOffset = getTextRange().getEndOffset() + gap;
                        }
                    }

                    Document document = getEditor().getDocument();
                    document.deleteString(Math.max(0, startOffset), Math.min(endOffset, getEditor().getDocument().getTextLength()));
                    clearSuggestion();
                }
            } catch (Exception ex) {
                clearSuggestion();
            }
        });
    }
}
