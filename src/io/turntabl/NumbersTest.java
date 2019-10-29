package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    public void TwoPositiveNumbers(){
        int result = Numbers.sum(4, 4);
        assertEquals(result , 8);
    }

    @Test
    public void IsANegativeNumberPositive(){
        boolean result = Numbers.isPositive(-15);
        assertFalse(result);
    }

    @Test
    public void IsAPositiveNumberNegative(){
        boolean result = Numbers.isNegative(23);
        assertFalse(result);
    }
}