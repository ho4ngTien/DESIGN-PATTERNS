package com.hoangtien.designpatterns.creational.factory;

public final class PushNotification implements Notification {
    @Override
    public String send(String recipient, String message) {
        return "Push to %s: %s".formatted(recipient, message);
    }
}
