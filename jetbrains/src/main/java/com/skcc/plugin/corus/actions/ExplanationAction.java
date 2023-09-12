package com.skcc.plugin.corus.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.skcc.plugin.corus.configs.Configs;
import com.skcc.plugin.corus.toolwindows.CorusWindow;
import com.skcc.plugin.corus.utils.ToolWindowUtils;
import org.jetbrains.annotations.NotNull;

public class ExplanationAction extends AnAction {

    /**
     * `update` �޼ҵ�� �׼��� Ȱ��ȭ ���θ� �����ϴ� �޼ҵ��Դϴ�.
     * `AnActionEvent`�� �Ű������� �޾� �̺�Ʈ�� �߻��� `Editor` ��ü�� ȹ���� ��
     * `editor`�� `null`�� �ƴ� ��� �̺�Ʈ�� Ȱ��ȭ �մϴ�.
     */
    @Override
    public void update(@NotNull AnActionEvent actionEvent) {
        // `PROD_MODE`�� �� �޴� �� ��� ��Ȱ��ȭ
        if (Configs.PROD_MODE) {
            actionEvent.getPresentation().setEnabled(false);
            actionEvent.getPresentation().setVisible(false);
            return;
        }
        final Editor editor = actionEvent.getData(CommonDataKeys.EDITOR);
        actionEvent.getPresentation().setEnabled(editor != null);
    }

    /**
     * `actionPerformed` �޼ҵ�� �׼��� ����� �� ȣ��Ǵ� �޼ҵ��Դϴ�.
     * ����Ű �Ǵ� �˾� �޴� Ŭ���� ���� ȣ��˴ϴ�.
     * `update` �Լ��� ���� Ȱ��ȭ ���ΰ� ������ �� ȣ��˴ϴ�.
     * ����, `corusWindow`�� `null`�� ��ȯ�Ǹ�, `TOOLWINDOW_ID`�� `config.xml`�� ���ǵ� `toolwindow id`�� ����ġ���� ������ Ȯ�� �ʿ�
     */
    @Override
    public void actionPerformed(AnActionEvent actionEvent) {
        final Editor editor = actionEvent.getRequiredData(CommonDataKeys.EDITOR);
        Project project = actionEvent.getProject();
        ToolWindowUtils.show(project);
        CorusWindow corusWindow = CorusWindow.getInstance();
        corusWindow.coding.action(Configs.EXPLANATION, project, editor);
    }
}