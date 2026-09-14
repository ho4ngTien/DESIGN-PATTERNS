package com.hoangtien.designpatterns.creational.factory;

public final class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
