package com.skcc.plugin.corus.widgets;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.StatusBarWidget;
import com.intellij.openapi.wm.StatusBarWidgetFactory;
import com.skcc.plugin.corus.configs.Configs;
import com.skcc.plugin.corus.configs.Globals;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CorusStatusBarWidgetFactory implements StatusBarWidgetFactory {
    @Override
    public @NonNls @NotNull String getId() {return Configs.WIDGET_ID;}

    @Override
    public @Nls @NotNull String getDisplayName() {return Configs.WIDGET_DISPLAY_NAME;}

    @Override
    public boolean isAvailable(@NotNull Project project) {return true;}

    @Override
    public @NotNull StatusBarWidget createWidget(@NotNull Project project) {
        CorusStatusBarWidget widget = new CorusStatusBarWidget(project);
        Globals.getInstance().setCorusStatusBarWidget(widget);
        return widget;
    }

    @Override
    public void disposeWidget(@NotNull StatusBarWidget widget) {
        // 위젯이 제거될 때 실행될 로직을 구현합니다.
    }

    @Override
    public boolean canBeEnabledOn(@NotNull StatusBar statusBar) {return true;}
}

