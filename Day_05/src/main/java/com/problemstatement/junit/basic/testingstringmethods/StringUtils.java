package com.problemstatement.junit.basic.testingstringmethods;

public class StringUtils {

    //Reversing string
    public String reverse(String str){
        if(str==null){
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    //Checking if string is palindrome
    public boolean isPalindrom(String str){
        if(str==null){
            return false;
        }
        String reversed= reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    //Converting string to uppercase
    public String toUpperCase(String str){
        if(str==null){
            return null;
        }
        return str.toUpperCase();
    }
}
