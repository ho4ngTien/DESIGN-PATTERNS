package com.hoangtien.designpatterns.creational.factory;

public final class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
