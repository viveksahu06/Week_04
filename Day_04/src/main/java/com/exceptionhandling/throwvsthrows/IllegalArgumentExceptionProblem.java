//6.throw vs. throws (Exception Propagation)
//Problem Statement:
//Create a method calculateInterest(double amount, double rate, int years) that:
//Throws IllegalArgumentException if amount or rate is negative.
//Propagates the exception using throws and handles it in main().
//Expected Behavior:
//If valid, return and print the calculated interest.
//If invalid, catch and display "Invalid input: Amount and rate must be positive".

package com.exceptionhandling.throwvsthrows;

//Creating IllegalArgumentExceptionProblem class
class IllegalArgumentExceptionProblem {

    //Defining calculateInterest method propagating IllegalArgumentException
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        //Checking if amount or rate is negative
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        //Calculating interest
        return amount * rate * years / 100;
    }

    public static void main(String[] args) {
        try {
            //Calling calculateInterest method
            double interest = calculateInterest(1000, 5, 2);
            //Printing calculated interest
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            //Handling invalid input exception
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}


