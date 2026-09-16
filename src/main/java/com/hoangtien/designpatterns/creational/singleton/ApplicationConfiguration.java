package com.hoangtien.designpatterns.creational.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ApplicationConfiguration {

    private final Map<String, String> values = new ConcurrentHashMap<>();

    private ApplicationConfiguration() {
    }

    private static class Holder {
        private static final ApplicationConfiguration INSTANCE = new ApplicationConfiguration();
    }

    public static ApplicationConfiguration getInstance() {
        return Holder.INSTANCE;
    }

    public String get(String key) {
        return values.get(key);
    }

    public void set(String key, String value) {
        values.put(key, value);
    }
}
