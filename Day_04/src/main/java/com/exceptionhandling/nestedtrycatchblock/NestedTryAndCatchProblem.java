//9.Nested try-catch Block
//💡 Problem Statement:
//Write a Java program that:
//Takes an array and a divisor as input.
//Tries to access an element at an index.
//Tries to divide that element by the divisor.
//Uses nested try-catch to handle:
//ArrayIndexOutOfBoundsException if the index is invalid.
//ArithmeticException if the divisor is zero.
//Expected Behavior:
//        If valid, print the division result.
//If the index is invalid, catch and display "Invalid array index!".
//If division by zero, catch and display "Cannot divide by zero!".
package com.exceptionhandling.nestedtrycatchblock;

import java.util.Scanner;

//Creating NestedTryAndCatchProblem class
public class NestedTryAndCatchProblem {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner scanner = new Scanner(System.in);
        //Initializing array
        int[] array = {10, 20, 30, 40, 50};

        //Taking index as input
        System.out.print("Enter array index: ");
        int index = scanner.nextInt();
        //Taking divisor as input
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        try {
            try {
                //Accessing element at given index
                int element = array[index];
                //Performing division
                int result = element / divisor;
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                //Handling invalid index exception
                System.out.println("Invalid array index!");
            }
        } catch (ArithmeticException e) {
            //Handling division by zero exception
            System.out.println("Cannot divide by zero!");
        } finally {
            //Closing Scanner object
            scanner.close();
        }
    }
}
