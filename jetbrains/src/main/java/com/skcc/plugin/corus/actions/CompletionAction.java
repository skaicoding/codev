package com.skcc.plugin.corus.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.skcc.plugin.corus.toolwindows.CorusWindow;
import com.skcc.plugin.corus.utils.ToolWindowUtils;
import org.jetbrains.annotations.NotNull;

import static com.skcc.plugin.corus.configs.Configs.*;

public class CompletionAction extends AnAction {

    /**
     * `update` 메소드는 액션의 활성화 여부를 결정하는 메소드입니다.
     * `AnActionEvent`를 매개변수로 받아 이벤트가 발생한 `Editor` 객체를 획득한 후
     * `editor`가 `null`이 아닌 경우 이벤트를 활성화 합니다.
     */
    @Override
    public void update(@NotNull AnActionEvent actionEvent) {
        final Editor editor = actionEvent.getData(CommonDataKeys.EDITOR);
        actionEvent.getPresentation().setEnabled(editor != null);
    }

    /**
     * `actionPerformed` 메소드는 액션이 수행될 때 호출되는 메소드입니다.
     * 단축키 또는 팝업 메뉴 클릭을 통해 호출됩니다.
     * `update` 함수를 통해 활성화 여부가 결정된 후 호출됩니다.
     * 만약, `corusWindow`가 `null`로 반환되면, `TOOLWINDOW_ID`와 `config.xml`에 정의된 `toolwindow id`가 불일치하지 않은지 확인 필요
     */
    @Override
    public void actionPerformed(AnActionEvent actionEvent) {
        final Editor editor = actionEvent.getRequiredData(CommonDataKeys.EDITOR);
        Project project = actionEvent.getProject();
        ToolWindowUtils.show(project);
        CorusWindow corusWindow = CorusWindow.getInstance();
        corusWindow.coding.action(COMPLETION, project, editor);
    }
}