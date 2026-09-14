package com.hoangtien.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public final class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal apply(BigDecimal subtotal) {
        return subtotal;
    }
}
