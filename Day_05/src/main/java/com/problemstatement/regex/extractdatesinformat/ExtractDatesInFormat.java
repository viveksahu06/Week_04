package com.problemstatement.regex.extractdatesinformat;

// Importing necessary classes for pattern matching
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDatesInFormat {
    public static void main(String[] args) {
        // Defining the input text containing dates
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Defining the regex pattern to match dates in the format dd/MM/yyyy
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // Compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher to find occurrences of the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Iterating through all matches found in the text
        while (matcher.find()) {
            // Printing each matched date
            System.out.print(matcher.group() + " ");
        }
    }
}

