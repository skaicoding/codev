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
     * `Notifications` �������츦 ���� ����ڿ��� �ʿ��� �˶��� �����ݴϴ�.
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
