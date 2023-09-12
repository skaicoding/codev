package com.skcc.plugin.corus.widgets;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.StatusBarWidget;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.util.Consumer;
import com.skcc.plugin.corus.configs.Configs;
import com.skcc.plugin.corus.configs.Globals;
import com.skcc.plugin.corus.configs.Messages;
import com.skcc.plugin.corus.utils.UIUtils;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class CorusStatusBarWidget implements StatusBarWidget {
    Globals globals = Globals.getInstance();
    final Project project;

    private int frameIndex = 0;

    public CorusStatusBarWidget(Project project) {this.project = project;}

    public void updateIcon() {
        StatusBar statusBar = WindowManager.getInstance().getStatusBar(project);
        if (statusBar != null) {
            Timer spinnerTimer = new Timer(Configs.SPINNER_SPEED, e -> {
                frameIndex = (frameIndex + 1) % UIUtils.spinnerIcon.length;
                statusBar.updateWidget(ID());
            });
            if (globals.spinnerOn()) {
                spinnerTimer.start();
            } else {
                spinnerTimer.stop();
                statusBar.updateWidget(ID());
            }
        }
    }

    @Override
    public @NotNull String ID() {return Configs.WIDGET_ID;}

    @Override
    public WidgetPresentation getPresentation() {
        return new IconPresentation() {
            @Override
            public Icon getIcon() {
                if (globals.spinnerOn()) return UIUtils.spinnerIcon[frameIndex];
                return globals.autoCodeCompletion ? UIUtils.getAutoOnIcon() : UIUtils.getAutoOffIcon();
            }

            @Override
            public String getTooltipText() {
                return globals.autoCodeCompletion ? Messages.AUTO_CODE_RECOMMENDATION_ON_MESSAGE : Messages.AUTO_CODE_RECOMMENDATION_OFF_MESSAGE;
            }

            @Override
            public Consumer<MouseEvent> getClickConsumer() {
                return mouseEvent -> globals.setAutoCodeCompletionToggle();
            }
        };
    }

    @Override
    public void install(@NotNull StatusBar statusBar) {
        // 위젯을 상태표시줄에 추가하는 로직을 구현합니다.
    }

    @Override
    public void dispose() {
        // 위젯이 제거될 때 실행될 로직을 구현합니다.
    }
}
