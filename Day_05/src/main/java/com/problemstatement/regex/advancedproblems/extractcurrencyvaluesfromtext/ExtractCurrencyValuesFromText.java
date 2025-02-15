package com.problemstatement.regex.advancedproblems.extractcurrencyvaluesfromtext;

// Importing necessary classes for pattern matching
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValuesFromText {
    public static void main(String[] args) {
        // Defining the input text containing currency values
        String text = "The price is $45.99, and the discount is 10.50.";

        // Defining the regex pattern to match currency values
        String regex = "\\$?\\d+\\.\\d{2}";

        // Compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher to find occurrences of the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Iterating through all matches found in the text
        while (matcher.find()) {
            // Printing each matched currency value
            System.out.print(matcher.group() + " ");
        }
    }
}

