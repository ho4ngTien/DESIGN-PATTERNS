package com.hoangtien.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public final class StrategyDemo {
    private StrategyDemo() {
    }

    public static void main(String[] args) {
        BigDecimal subtotal = new BigDecimal("100.00");
        CheckoutService checkout = new CheckoutService(new StudentDiscountStrategy());

        System.out.println("Student total: " + checkout.totalFor(subtotal));
    }
}
