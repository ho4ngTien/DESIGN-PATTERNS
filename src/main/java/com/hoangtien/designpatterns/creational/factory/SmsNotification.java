package com.hoangtien.designpatterns.creational.factory;

public final class SmsNotification implements Notification {
    @Override
    public String send(String recipient, String message) {
        return "SMS to %s: %s".formatted(recipient, message);
    }
}
