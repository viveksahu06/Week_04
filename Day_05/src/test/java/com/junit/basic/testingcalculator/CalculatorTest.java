package com.junit.basic.testingcalculator;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.basic.testingcalculator.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    //Testing addition operation
    @Test
    void testAddition(){
        assertEquals(5, calculator.add(3,2));
        assertEquals(-1, calculator.add(-2,1));
        assertEquals(0, calculator.add(0,0));
    }

    //Testing subtraction operation
    @Test
    void testSubtract(){
        assertEquals(5, calculator.subtract(10,5));
        assertEquals(-5, calculator.subtract(-2,3));
        assertEquals(0,calculator.subtract(4,4));
    }

    //Testing multiplication operation
    @Test
    void testMultiply(){
        assertEquals(15, calculator.multiply(5,3));
        assertEquals(-15, calculator.multiply(-5,3));
        assertEquals(0, calculator.multiply(0,3));
    }

    //Testing division operation
    @Test
    void testDivide(){
        assertEquals(5, calculator.divide(15,3));
        assertEquals(-5, calculator.divide(-15,3));
    }

    //Testing division by zero handling
    @Test
    void testDivideByZero(){
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5,0);
        });
        assertEquals("Division by Zero is not allowed", exception.getMessage());
    }
}
