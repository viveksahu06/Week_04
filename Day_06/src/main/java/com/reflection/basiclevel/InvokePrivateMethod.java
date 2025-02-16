package com.reflection.basiclevel;

import java.lang.reflect.*;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            // Creating Calculator object
            Calculator calculator = new Calculator();

            // Getting Class object
            Class<?> clazz = calculator.getClass();

            // Accessing private method
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Allowing access to private method

            // Invoking the method and getting the result
            int result = (int) multiplyMethod.invoke(calculator, 5, 10);

            // Printing the result
            System.out.println("Multiplication Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
