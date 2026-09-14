package com.hoangtien.designpatterns.creational.factory;

public final class FactoryMethodDemo {
    private FactoryMethodDemo() {
    }

    public static void main(String[] args) {
        NotificationFactory factory = new EmailNotificationFactory();
        System.out.println(factory.notify("learner@example.com", "Factory Method works."));
    }
}
