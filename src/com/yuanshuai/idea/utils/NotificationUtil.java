package com.yuanshuai.idea.utils;

import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.project.Project;

public class NotificationUtil {

    private static NotificationGroup notificationGroup = new NotificationGroup("Java2Json.NotificationGroup", NotificationDisplayType.BALLOON, true);

    public static void warnNotify(String message, Project project) {
        Notifications.Bus.notify(notificationGroup.createNotification(message, NotificationType.WARNING), project);
    }

    public static void infoNotify(String message, Project project) {
        Notifications.Bus.notify(notificationGroup.createNotification(message, NotificationType.INFORMATION), project);
    }

    public static void errorNotify(String message, Project project) {
        Notifications.Bus.notify(notificationGroup.createNotification(message, NotificationType.ERROR), project);
    }

}
