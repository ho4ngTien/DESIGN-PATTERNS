package com.hoangtien.designpatterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class BuilderTest {
    @Test
    void shouldBuildProfileWithRequiredAndOptionalFields() {
        UserProfile profile = UserProfile.builder("tien", "tien@example.com")
                .displayName("Tien")
                .bio("Pattern learner")
                .newsletterSubscribed(true)
                .build();

        assertEquals("tien", profile.username());
        assertEquals("Tien", profile.displayName());
        assertEquals("Pattern learner", profile.bio());
        assertTrue(profile.newsletterSubscribed());
    }

    @Test
    void shouldUseDefaultsForOptionalFields() {
        UserProfile profile = UserProfile.builder("tien", "tien@example.com").build();

        assertEquals("tien@example.com", profile.email());
        assertFalse(profile.newsletterSubscribed());
    }
}
