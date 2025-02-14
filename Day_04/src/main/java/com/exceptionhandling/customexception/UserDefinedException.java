package com.exceptionhandling.customexception;

//Creating a Custom Exception - Extending UserDefinedException to Exception
class UserDefinedException extends Exception {
    //Constructor
    public UserDefinedException(String message) {
        super(message);
    }
}