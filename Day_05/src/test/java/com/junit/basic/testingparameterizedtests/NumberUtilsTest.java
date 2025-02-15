package com.junit.basic.testingparameterizedtests;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.basic.testingparameterizedtests.NumberUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {
    private final NumberUtils numberUtils = new NumberUtils();

    // Test for even numbers
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 100, -2, 0})  // Even numbers
    void testIsEvenForEvenNumbers(int number) {
        assertTrue(numberUtils.isEven(number), number + " should be even");
    }

    // Test for odd numbers
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, -1, -3, 101})  // Odd numbers
    void testIsEvenForOddNumbers(int number) {
        assertFalse(numberUtils.isEven(number), number + " should be odd");
    }
}
