//7.finally Block Execution
//        💡 Problem Statement:
//        Write a program that performs integer division and demonstrates the finally block execution.
//        The program should:
//        Take two integers from the user.
//        Perform division.
//        Handle ArithmeticException (if dividing by zero).
//        Ensure "Operation completed" is always printed using finally.
//        Expected Behavior:
//        If valid, print the result.
//        If an exception occurs, handle it and still print "Operation completed".
package com.exceptionhandling.finallyblockexecution;

import java.util.Scanner;

//Creating FinallyBlockExecution class
public class FinallyBlockExecution {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner scanner = new Scanner(System.in);
        try {
            //Taking numerator as input
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            //Taking denominator as input
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            //Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            //Handling division by zero exception
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            //Printing operation completion message
            System.out.println("Operation completed");
            //Closing Scanner object
            scanner.close();
        }
    }
}
