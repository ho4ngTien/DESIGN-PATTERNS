package com.hoangtien.designpatterns.behavioral.strategy;

import java.math.BigDecimal;
import java.util.Objects;

public final class CheckoutService {
    private final DiscountStrategy discountStrategy;

    public CheckoutService(DiscountStrategy discountStrategy) {
        this.discountStrategy = Objects.requireNonNull(discountStrategy);
    }

    public BigDecimal totalFor(BigDecimal subtotal) {
        Objects.requireNonNull(subtotal);
        if (subtotal.signum() < 0) {
            throw new IllegalArgumentException("Subtotal cannot be negative");
        }
        return discountStrategy.apply(subtotal);
    }
}
