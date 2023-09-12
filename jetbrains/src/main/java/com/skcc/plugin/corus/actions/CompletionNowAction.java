package com.skcc.plugin.corus.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.skcc.plugin.corus.configs.Globals;
import org.jetbrains.annotations.NotNull;

public class CompletionNowAction extends AnAction {
    CorusEditorFactoryListener editor = CorusEditorFactoryListener.getInstance();

    /**
     * `update` �޼ҵ�� �׼��� Ȱ��ȭ ���θ� �����ϴ� �޼ҵ��Դϴ�.
     * ���� Ȱ��ȭ �� `editor`�� `suggestionText`�� �� ���� �ƴ� ��� �� Ű �Է� �̺�Ʈ�� Ȱ��ȭ �մϴ�.
     */
    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setEnabled(Globals.getInstance().autoCodeCompletion);
    }

    /**
     * `actionPerformed` �޼ҵ�� �׼��� ����� �� ȣ��Ǵ� �޼ҵ��Դϴ�.
     * �� Ű�� ���� �� ��õ �ڵ带 �����մϴ�.
     * `update` �Լ��� ���� Ȱ��ȭ ���ΰ� ������ �� ȣ��˴ϴ�.
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent actionEvent) {
        if (!editor.getSuggestion().isEmpty()) editor.deleteSuggestion(null);
        editor.getCompletions();
    }
}
