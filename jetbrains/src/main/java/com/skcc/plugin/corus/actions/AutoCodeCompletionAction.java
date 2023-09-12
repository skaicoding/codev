package com.skcc.plugin.corus.actions;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.skcc.plugin.corus.configs.Globals;
import org.jetbrains.annotations.NotNull;

public class AutoCodeCompletionAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Globals.getInstance().setAutoCodeCompletionToggle();
    }

    @Override
    public void update(AnActionEvent e) {
        Presentation presentation = e.getPresentation();
        // 아이콘 변경 및 체크 표시 설정
        if (Globals.getInstance().autoCodeCompletion) {
            presentation.setIcon(AllIcons.General.InspectionsOK); // 원하는 아이콘으로 변경
            presentation.putClientProperty("checked", Boolean.TRUE);
        } else {
            presentation.setIcon(null);
            presentation.putClientProperty("checked", null);
        }
    }
}
