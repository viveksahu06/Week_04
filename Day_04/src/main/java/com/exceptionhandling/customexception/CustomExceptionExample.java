//3. Custom Exception (User-defined Exception)
//💡 Problem Statement:
//Create a custom exception called InvalidAgeException.
//Write a method validateAge(int age) that throws InvalidAgeException if the age is below 18.
//In main(), take user input and call validateAge().
//If an exception occurs, display "Age must be 18 or above".
//Expected Behavior:
//If the age is >=18, print "Access granted!".
//If age <18, throw InvalidAgeException and display the message.

package com.exceptionhandling.customexception;

//Creating a Custom Exception - Extending UserDefinedException to Exception

//Using a Custom Exception
public class CustomExceptionExample {
    public static void main(String[] args) {
        //try block
        try {
            //Calling method to check where age is valid or not
            validateAge(17);
        }
        //catch block
        catch (UserDefinedException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
    //Method to check age validation
    public static void validateAge(int age) throws UserDefinedException {
        //Condition to check age
        if (age < 18) {
            throw new UserDefinedException("Age must be 18 or older");
        }
    }
}