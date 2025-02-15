package com.junit.basic.testingcalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    private final Calculator calculator=new Calculator();
    @Test
    void testAddtion(){
        assertEquals(5, calculator.add(3,2));
        assertEquals(-1, calculator.add(-2,1));
        assertEquals(0, calculator.add(0,0));
    }
    @Test
    void testSubtract(){
        assertEquals(5, calculator.subtract(10,5));
        assertEquals(-5, calculator.subtract(-2,3));
        assertEquals(0,calculator.subtract(4,4));
    }
    @Test
    void testMultiply(){
        assertEquals(15, calculator.multiply(5,3));
        assertEquals(-15,calculator.multiply(-5,3));
        assertEquals(0, calculator.multiply(0,3));
    }
    @Test
    void testDivide(){
        assertEquals(5, calculator.divide(15,3));
        assertEquals(-5, calculator.divide(-15,3));

    }
    @Test
    void testDivideByZero(){
        Exception exception=assertThrows(ArithmeticException.class,()->{
            calculator.divide(5,0);
        });
        assertEquals("Division by Zero is not allowed", exception.getMessage());
    }


}
