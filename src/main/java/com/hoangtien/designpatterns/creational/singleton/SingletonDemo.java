package com.hoangtien.designpatterns.creational.singleton;

public final class SingletonDemo {
    private SingletonDemo() {
    }

    public static void main(String[] args) {
        ApplicationConfiguration configuration = ApplicationConfiguration.getInstance();
        configuration.set("demo.mode", "learning");

        System.out.println(configuration.get("application.name"));
        System.out.println(ApplicationConfiguration.getInstance().get("demo.mode"));
        System.out.println(configuration == ApplicationConfiguration.getInstance());
    }
}
