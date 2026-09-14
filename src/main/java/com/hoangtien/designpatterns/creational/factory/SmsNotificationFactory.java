package com.hoangtien.designpatterns.creational.factory;

public final class SmsNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
