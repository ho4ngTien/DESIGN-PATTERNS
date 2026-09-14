package com.hoangtien.designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class SingletonTest {
    @Test
    void shouldReturnTheSameInstance() {
        assertSame(ApplicationConfiguration.getInstance(), ApplicationConfiguration.getInstance());
    }

    @Test
    void shouldShareConfigurationThroughTheSingleInstance() {
        ApplicationConfiguration first = ApplicationConfiguration.getInstance();
        first.set("test.key", "shared");

        assertEquals("shared", ApplicationConfiguration.getInstance().get("test.key"));
    }
}
