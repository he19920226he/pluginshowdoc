package com.yuanshuai.idea.utils;

import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;

import javax.annotation.Nullable;

/**
 * showDoc相关的提示信息
 */
public class ShowDocNotification {
    // 和plugin.xml里面的保持一致
    static String notificationGroup = "showdoc.notification.group";

    /**
     * 告警通知
     * @param message String
     * @param project Project
     */
    public static void warnNotify(String message, @Nullable Project project) {
        NotificationGroupManager.getInstance().getNotificationGroup(notificationGroup)
                .createNotification(message, NotificationType.WARNING)
                .notify(project);
    }

    /**
     * Info通知
     * @param message String
     * @param project String
     */
    public static void infoNotify(String message,@Nullable Project project) {
        NotificationGroupManager.getInstance().getNotificationGroup(notificationGroup)
                .createNotification(message, NotificationType.INFORMATION)
                .notify(project);
    }

    /**
     * 错误通知
     * @param message String
     * @param project String
     */
    public static void errorNotify(String message,@Nullable Project project) {
        NotificationGroupManager.getInstance().getNotificationGroup(notificationGroup)
                .createNotification(message, NotificationType.ERROR)
                .notify(project);
    }
}
