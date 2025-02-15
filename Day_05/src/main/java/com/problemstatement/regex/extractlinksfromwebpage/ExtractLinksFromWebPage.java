package com.problemstatement.regex.extractlinksfromwebpage;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebPage {
    public static void main(String[] args) {
        // Defining the input text containing URLs
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Defining the regex pattern to match URLs starting with http or https
        String regex = "https?://(www\\.)?[A-Za-z0-9.-]+";

        // Compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher to find occurrences of the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Iterating through all matches found in the text
        while (matcher.find()) {
            // Printing each matched URL
            System.out.println(matcher.group());
        }
    }
}

