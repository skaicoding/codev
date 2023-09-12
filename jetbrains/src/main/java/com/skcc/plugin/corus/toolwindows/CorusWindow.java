package com.skcc.plugin.corus.toolwindows;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManager;
import com.skcc.plugin.corus.configs.Configs;
import com.skcc.plugin.corus.utils.UIUtils;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CorusWindow implements ToolWindowFactory {
    private static CorusWindow instance;

    public ToolWindow toolWindow;

    // `coding`�� �г� ����
    final String codingPanelName = Configs.CODING_PANEL_NAME;
    public Content codingContent;
    public Coding coding = new Coding();

    // `chat`�� �г� ����
    final String chatPanelName = Configs.CHAT_PANEL_NAME; //"AdvancedChat";
    public Content chatContent;
    public Chat chat = new Chat();

    // `config`�� �г� ����
    final String configPanelName = Configs.CONFIG_PANEL_NAME;
    public Content configContent;
    public Config config = new Config();

    public static CorusWindow getInstance() {return instance;}

    public void updateToolWindowIcon() {
        // �׸��� ���� �������� �������� ����
        if (toolWindow != null) toolWindow.setIcon(UIUtils.getIcon());
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, ToolWindow toolWindow) {
        instance = this;
        this.toolWindow = toolWindow;
        ContentFactory contentFactory = ContentFactory.getInstance();

        // �׸��� ���� �������� �������� ����
        updateToolWindowIcon();

        // Content ����
        toolWindow.getContentManager().addContent(codingContent = createContentWithPanel(contentFactory, codingPanelName, coding.createMainPanel(project)));
        toolWindow.getContentManager().addContent(chatContent = createContentWithPanel(contentFactory, chatPanelName, chat.createMainPanel()));
        toolWindow.getContentManager().addContent(configContent = createContentWithPanel(contentFactory, configPanelName, config.createMainPanel()));

        // Content Ȱ��ȭ
        if (config.getDefaultTab().equals(chatPanelName)) activateContent(chatContent);
        else activateContent(codingContent);

        // `PROD_MODE`������ ����� ����
        if (Configs.PROD_MODE) {
            toolWindow.getContentManager().removeContent(chatContent, true);
        }
    }

    private Content createContentWithPanel(ContentFactory contentFactory, String name, JPanel panel) {
        Content content = contentFactory.createContent(panel, name, false);
        content.setCloseable(true);
        content.setPreferredFocusableComponent(panel);
        content.setDisposer(() -> {
            // `Content`�� ���� �� ������ �۾�
        });
        return content;
    }

    public void activateContent(Content content) {
        ContentManager contentManager = toolWindow.getContentManager();
        contentManager.setSelectedContent(content);
    }
}
