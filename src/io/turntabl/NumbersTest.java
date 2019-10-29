package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    public void TwoPositiveNumbers() {
        int result = Numbers.sum(4, 4);
        assertEquals(result, 8);
    }

    @Test
    public void IsANegativeNumberPositive() {
        boolean result = Numbers.isPositive(-15);
        assertFalse(result);
    }

    @Test
    public void IsPositiveZero() {
        boolean result = Numbers.isPositive(5);
        assertFalse(result);
    }

    @Test
    public void testIsNegativeZero() {
        boolean result = Numbers.isNegative(0);
        assertFalse(result);
    }

    @Test
    void testIsEvenAndGreaterThanZero() {
        boolean result = Numbers.isEvenAndGreaterThanZero(4);
        assertTrue(result);
    }


    // leap year....testing for all failures
    @Test
    void isALeapYearNotDivisibleBy4() {
        boolean result = Numbers.isALeapYear(102);
        assertFalse(result);
    }

    @Test
    void isALeapYearCenturyYearButNotDivisibleBy4() {
        boolean result = Numbers.isALeapYear(250);
        assertFalse(result);
    }

    @Test
    void isALeapYear() {
        boolean result = Numbers.isALeapYear(400);
        assertTrue(result);
    }
}
