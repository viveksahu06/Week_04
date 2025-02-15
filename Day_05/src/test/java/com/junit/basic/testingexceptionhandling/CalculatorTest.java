package com.junit.basic.testingexceptionhandling;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.basic.testingcalculator.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    //Testing division operation with valid inputs
    @Test
    void testDivide(){
        assertEquals(15, calculator.divide(30,2));
        assertEquals(-5, calculator.divide(-15,3));
    }

    //Testing division by zero handling
    @Test
    void testByZeroDivide(){
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10,0);
        });
        assertEquals("Division by Zero not Allowed", exception.getMessage());
    }
}
