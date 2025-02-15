package com.problemstatement.regex.extractallcapitalizedwordsfromsentence;

// Importing necessary classes for pattern matching
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWordsFromSentence {
    public static void main(String[] args) {
        // Defining the input text containing capitalized words
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Defining the regex pattern to match capitalized words
        String regex = "[A-Z][a-z]+";

        // Compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher to find occurrences of the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Iterating through all matches found in the text
        while (matcher.find()) {
            // Printing each matched capitalized word
            System.out.print(matcher.group() + " ");
        }
    }
}

