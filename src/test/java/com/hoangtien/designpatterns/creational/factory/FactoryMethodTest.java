package com.hoangtien.designpatterns.creational.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

class FactoryMethodTest {
    @Test
    void shouldCreateEmailNotification() {
        Notification notification = new EmailNotificationFactory().createNotification();

        assertInstanceOf(EmailNotification.class, notification);
        assertEquals("Email to user@example.com: Welcome", notification.send("user@example.com", "Welcome"));
    }

    @Test
    void shouldKeepWorkflowIndependentFromConcreteNotification() {
        assertEquals("SMS to +84123: Code 1234",
                new SmsNotificationFactory().notify("+84123", "Code 1234"));
    }
}
