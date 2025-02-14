package com.exceptionhandling.customexception;
class UserDefinedException extends Exception {
    //Constructor
    public UserDefinedException(String message) {
        super(message);
    }
}