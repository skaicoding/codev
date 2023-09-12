package com.skcc.plugin.corus.listeners;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import com.skcc.plugin.corus.configs.Globals;
import com.skcc.plugin.corus.toolwindows.CorusWindow;
import org.jetbrains.annotations.NotNull;

public class ThemeChangeListener implements LafManagerListener {
    @Override
    public void lookAndFeelChanged(@NotNull LafManager source) {
        CorusWindow corusWindow = CorusWindow.getInstance();
        if (corusWindow != null && corusWindow.toolWindow != null) {
            Globals.getInstance().setTheme();
            corusWindow.chat.clearAllCards();
            corusWindow.updateToolWindowIcon();
        }
    }
}
