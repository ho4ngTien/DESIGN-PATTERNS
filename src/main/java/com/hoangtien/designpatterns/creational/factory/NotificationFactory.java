package com.hoangtien.designpatterns.creational.factory;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public String notify(String recipient, String message) {
        return createNotification().send(recipient, message);
    }
}
