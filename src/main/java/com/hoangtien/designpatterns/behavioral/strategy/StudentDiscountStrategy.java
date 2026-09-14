package com.hoangtien.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public final class StudentDiscountStrategy implements DiscountStrategy {
    private static final BigDecimal DISCOUNT_RATE = new BigDecimal("0.10");

    @Override
    public BigDecimal apply(BigDecimal subtotal) {
        return subtotal.multiply(BigDecimal.ONE.subtract(DISCOUNT_RATE));
    }
}
