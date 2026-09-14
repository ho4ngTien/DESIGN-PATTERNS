package com.hoangtien.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public interface DiscountStrategy {
    BigDecimal apply(BigDecimal subtotal);
}
