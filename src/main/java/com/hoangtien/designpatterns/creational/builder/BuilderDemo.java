package com.hoangtien.designpatterns.creational.builder;

public final class BuilderDemo {
    private BuilderDemo() {
    }

    public static void main(String[] args) {
        UserProfile profile = UserProfile.builder("hoangtien", "hello@example.com")
                .displayName("Hoang Tien")
                .bio("Learning design patterns")
                .newsletterSubscribed(true)
                .build();

        System.out.println(profile.displayName() + " <" + profile.email() + ">");
    }
}
