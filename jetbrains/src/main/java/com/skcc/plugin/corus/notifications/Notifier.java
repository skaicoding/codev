package com.skcc.plugin.corus.notifications;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;
import com.skcc.plugin.corus.utils.StringUtils;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public class Notifier {
    /**
     * `Notifications` 툴윈도우를 통해 사용자에게 필요한 알람을 보여줍니다.
     */
    public static void showMessage(@Nullable Project project, String message, boolean popup) {
        EventQueue.invokeLater(() -> {
            String text = StringUtils.replaceSpecialCharacters(message);
            NotificationType notificationType = text.startsWith("Error:") ? NotificationType.ERROR: NotificationType.INFORMATION;
            String groupId = popup ? "BalloonTypeNotificationGroup" : "NoneTypeNotificationGroup";
            Notification notification = NotificationGroupManager.getInstance()
                    .getNotificationGroup(groupId)
                    .createNotification(text, notificationType);
            notification.notify(project);
        });
    }
}
