package com.skcc.plugin.corus.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.skcc.plugin.corus.configs.Globals;
import org.jetbrains.annotations.NotNull;

public class CompletionNowAction extends AnAction {
    CorusEditorFactoryListener editor = CorusEditorFactoryListener.getInstance();

    /**
     * `update` 메소드는 액션의 활성화 여부를 결정하는 메소드입니다.
     * 현재 활성화 된 `editor`에 `suggestionText`가 빈 값이 아닌 경우 탭 키 입력 이벤트를 활성화 합니다.
     */
    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setEnabled(Globals.getInstance().autoCodeCompletion);
    }

    /**
     * `actionPerformed` 메소드는 액션이 수행될 때 호출되는 메소드입니다.
     * 탭 키를 누를 떄 추천 코드를 수락합니다.
     * `update` 함수를 통해 활성화 여부가 결정된 후 호출됩니다.
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent actionEvent) {
        if (!editor.getSuggestion().isEmpty()) editor.deleteSuggestion(null);
        editor.getCompletions();
    }
}
