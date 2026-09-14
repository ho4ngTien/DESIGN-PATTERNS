package com.hoangtien.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class StrategyTest {
    private static final BigDecimal SUBTOTAL = new BigDecimal("100.00");

    @Test
    void shouldApplyStudentDiscount() {
        assertTotal(new StudentDiscountStrategy(), "90.00");
    }

    @Test
    void shouldApplyVipDiscount() {
        assertTotal(new VipDiscountStrategy(), "80.00");
    }

    @Test
    void shouldApplyNoDiscount() {
        assertTotal(new NoDiscountStrategy(), "100.00");
    }

    @Test
    void shouldRejectNegativeSubtotal() {
        CheckoutService checkout = new CheckoutService(new NoDiscountStrategy());

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
            () -> checkout.totalFor(new BigDecimal("-1.00")));

        assertEquals("Subtotal cannot be negative", exception.getMessage());
    }

    private void assertTotal(DiscountStrategy strategy, String expected) {
        BigDecimal actual = new CheckoutService(strategy).totalFor(SUBTOTAL);
        assertEquals(0, actual.compareTo(new BigDecimal(expected)));
    }
}
