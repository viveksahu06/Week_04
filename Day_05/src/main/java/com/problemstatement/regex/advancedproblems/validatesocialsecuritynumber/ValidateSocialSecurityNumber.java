package com.problemstatement.regex.advancedproblems.validatesocialsecuritynumber;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";

        // Defining the regex pattern to match a valid SSN
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher to find occurrences of the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Checking if the SSN pattern is found
        if (matcher.find()) {
            // Extracting and printing the matched SSN
            System.out.println("Valid SSN found: " + matcher.group());
        } else {
            System.out.println("No valid SSN found.");
        }
    }
}
