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

    // `coding`용 패널 정의
    final String codingPanelName = Configs.CODING_PANEL_NAME;
    public Content codingContent;
    public Coding coding = new Coding();

    // `chat`용 패널 정의
    final String chatPanelName = Configs.CHAT_PANEL_NAME; //"AdvancedChat";
    public Content chatContent;
    public Chat chat = new Chat();

    // `config`용 패널 정의
    final String configPanelName = Configs.CONFIG_PANEL_NAME;
    public Content configContent;
    public Config config = new Config();

    public static CorusWindow getInstance() {return instance;}

    public void updateToolWindowIcon() {
        // 테마에 따라 아이콘을 동적으로 지정
        if (toolWindow != null) toolWindow.setIcon(UIUtils.getIcon());
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, ToolWindow toolWindow) {
        instance = this;
        this.toolWindow = toolWindow;
        ContentFactory contentFactory = ContentFactory.getInstance();

        // 테마에 따라 아이콘을 동적으로 지정
        updateToolWindowIcon();

        // Content 생성
        toolWindow.getContentManager().addContent(codingContent = createContentWithPanel(contentFactory, codingPanelName, coding.createMainPanel(project)));
        toolWindow.getContentManager().addContent(chatContent = createContentWithPanel(contentFactory, chatPanelName, chat.createMainPanel()));
        toolWindow.getContentManager().addContent(configContent = createContentWithPanel(contentFactory, configPanelName, config.createMainPanel()));

        // Content 활성화
        if (config.getDefaultTab().equals(chatPanelName)) activateContent(chatContent);
        else activateContent(codingContent);

        // `PROD_MODE`에서는 기능을 숨김
        if (Configs.PROD_MODE) {
            toolWindow.getContentManager().removeContent(chatContent, true);
        }
    }

    private Content createContentWithPanel(ContentFactory contentFactory, String name, JPanel panel) {
        Content content = contentFactory.createContent(panel, name, false);
        content.setCloseable(true);
        content.setPreferredFocusableComponent(panel);
        content.setDisposer(() -> {
            // `Content`가 닫힐 때 수행할 작업
        });
        return content;
    }

    public void activateContent(Content content) {
        ContentManager contentManager = toolWindow.getContentManager();
        contentManager.setSelectedContent(content);
    }
}
