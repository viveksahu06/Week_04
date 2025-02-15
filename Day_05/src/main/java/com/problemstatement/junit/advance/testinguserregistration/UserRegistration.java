package com.problemstatement.junit.advance.testinguserregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    //Defining email pattern for validation
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    //Registering user with username, email, and password validation
    public String registerUser(String username, String email, String password){

        //Checking if username is empty
        if(username==null || username.trim().isEmpty()){
            throw new IllegalArgumentException("Username cannot be empty");
        }

        //Validating email format
        if(email==null || !EMAIL_PATTERN.matcher(email).matches()){
            throw new IllegalArgumentException("Invalid email format");
        }

        //Checking password length requirement
        if(password==null || password.length()<8){
            throw new IllegalArgumentException("Password must be at least 8 charceter long");
        }

        return "User Registered Successfully";
    }
}
