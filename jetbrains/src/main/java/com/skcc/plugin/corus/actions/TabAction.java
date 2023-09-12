package com.skcc.plugin.corus.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class TabAction extends AnAction {
    CorusEditorFactoryListener editor = CorusEditorFactoryListener.getInstance();

    /**
     * `update` �޼ҵ�� �׼��� Ȱ��ȭ ���θ� �����ϴ� �޼ҵ��Դϴ�.
     * ���� Ȱ��ȭ �� `editor`�� `suggestionText`�� �� ���� �ƴ� ��� �� Ű �Է� �̺�Ʈ�� Ȱ��ȭ �մϴ�.
     */
    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setEnabled(!editor.getSuggestion().isEmpty());
    }

    /**
     * `actionPerformed` �޼ҵ�� �׼��� ����� �� ȣ��Ǵ� �޼ҵ��Դϴ�.
     * �� Ű�� ���� �� ��õ �ڵ带 �����մϴ�.
     * `update` �Լ��� ���� Ȱ��ȭ ���ΰ� ������ �� ȣ��˴ϴ�.
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent actionEvent) {
        editor.setAllSuggestion();
    }
}
