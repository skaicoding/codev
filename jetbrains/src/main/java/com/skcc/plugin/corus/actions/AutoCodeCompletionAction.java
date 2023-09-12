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
        // ������ ���� �� üũ ǥ�� ����
        if (Globals.getInstance().autoCodeCompletion) {
            presentation.setIcon(AllIcons.General.InspectionsOK); // ���ϴ� ���������� ����
            presentation.putClientProperty("checked", Boolean.TRUE);
        } else {
            presentation.setIcon(null);
            presentation.putClientProperty("checked", null);
        }
    }
}
