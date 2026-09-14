package com.hoangtien.designpatterns.creational.factory;

public final class EmailNotification implements Notification {
    @Override
    public String send(String recipient, String message) {
        return "Email to %s: %s".formatted(recipient, message);
    }
}
