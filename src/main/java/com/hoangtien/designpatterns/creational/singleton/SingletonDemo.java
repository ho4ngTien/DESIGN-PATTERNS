package com.hoangtien.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        System.out.println(first == second);
    }
}
