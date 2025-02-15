package com.problemstatement.junit.basic.testingexceptionhandling;

public class Calculator {

    //Dividing two numbers with exception handling
    public int divide(int a, int b){
        //Checking for division by zero
        if(b==0){
            throw new ArithmeticException("Division by Zero not Allowed");
        }
        return a/b;
    }
}
