package com.problemstatement.regex.replacemultiplespaceswithasinglespace;

// Importing necessary classes for pattern matching
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleSpacesWithSingleSpace {
    public static void main(String[] args) {
        // Defining the input text containing multiple spaces
        String text = "This is   an example with   multiple  spaces";

        // Defining the regex pattern to match one or more whitespace characters
        String regex = "\\s+";

        // Replacing all occurrences of multiple spaces with a single space
        String result = text.replaceAll(regex, " ");

        // Printing the original text
        System.out.println(text);

        // Printing the modified text with single spaces
        System.out.println(result);
    }
}
