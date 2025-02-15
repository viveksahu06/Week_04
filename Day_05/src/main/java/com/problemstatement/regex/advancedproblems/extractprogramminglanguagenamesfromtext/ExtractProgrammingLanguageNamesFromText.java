package com.problemstatement.regex.advancedproblems.extractprogramminglanguagenamesfromtext;

// Importing necessary classes for pattern matching
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageNamesFromText {
    public static void main(String[] args) {
        // Defining the input text containing programming language names
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Defining the regex pattern to match specific programming language names
        String regex = "(Java|Python|JavaScript|Go)";

        // Compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher to find occurrences of the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Iterating through all matches found in the text
        while (matcher.find()) {
            // Printing each matched programming language name
            System.out.print(matcher.group() + " ");
        }
    }
}

