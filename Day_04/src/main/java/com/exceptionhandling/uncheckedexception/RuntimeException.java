package com.exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Creating RuntimeException class
public class RuntimeException {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner sc = new Scanner(System.in);
        try {
            //Taking first integer as input
            System.out.println("Enter 1st integer");
            int num1 = sc.nextInt();
            //Taking second integer as input
            System.out.println("Enter 2nd integer");
            int num2 = sc.nextInt();

            //Performing division
            int div = num1 / num2;
            System.out.println("Divisible by " + num2 + " and " + num1 + " is " + div);
        }
        catch (ArithmeticException arithmeticException) {
            //Handling division by zero exception
            System.out.println("ArithmeticException occurred " + arithmeticException.getMessage());
        }
        catch (InputMismatchException inputMismatchException) {
            //Handling invalid input exception
            System.out.println("InputMismatchException occurred " + inputMismatchException.getMessage());
        }
    }
}
