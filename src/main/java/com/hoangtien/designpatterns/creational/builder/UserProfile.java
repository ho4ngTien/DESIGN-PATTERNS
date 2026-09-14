package com.hoangtien.designpatterns.creational.builder;

import java.util.Objects;

public final class UserProfile {
    private final String username;
    private final String email;
    private final String displayName;
    private final String bio;
    private final boolean newsletterSubscribed;

    private UserProfile(Builder builder) {
        username = builder.username;
        email = builder.email;
        displayName = builder.displayName;
        bio = builder.bio;
        newsletterSubscribed = builder.newsletterSubscribed;
    }

    public static Builder builder(String username, String email) {
        return new Builder(username, email);
    }

    public String username() {
        return username;
    }

    public String email() {
        return email;
    }

    public String displayName() {
        return displayName;
    }

    public String bio() {
        return bio;
    }

    public boolean newsletterSubscribed() {
        return newsletterSubscribed;
    }

    public static final class Builder {
        private final String username;
        private final String email;
        private String displayName;
        private String bio;
        private boolean newsletterSubscribed;

        private Builder(String username, String email) {
            this.username = Objects.requireNonNull(username);
            this.email = Objects.requireNonNull(email);
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder bio(String bio) {
            this.bio = bio;
            return this;
        }

        public Builder newsletterSubscribed(boolean newsletterSubscribed) {
            this.newsletterSubscribed = newsletterSubscribed;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }
}
