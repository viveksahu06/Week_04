package com.problemstatement.junit.advance.testingpasswordstrengthvalidator;

public class PasswordValidator {

    //Checking password validity
    public boolean isValid(String password){
        if(password==null || password.length()<8){
            return false;
        }

        boolean hasUppercase=false;
        boolean hasDigit=false;

        //Iterating through password characters
        for(char ch:password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUppercase=true;
            }
            if(Character.isDigit(ch)){
                hasDigit=true;
            }
            //Returning true if both conditions met
            if(hasDigit && hasUppercase){
                return true;
            }
        }

        return false;
    }
}
