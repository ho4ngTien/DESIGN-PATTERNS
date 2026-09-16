package com.hoangtien.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        ApplicationConfiguration first = ApplicationConfiguration.getInstance();
        ApplicationConfiguration second = ApplicationConfiguration.getInstance();

        first.set("environment", "development");

        System.out.println(first == second);
        System.out.println(second.get("environment"));
    }
}
