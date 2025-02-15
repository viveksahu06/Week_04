package com.problemstatement.regex.extractallemailaddressesfromtext;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddressesFromText {
    public static void main(String[] args) {
        // Defining the input text containing email addresses
        String text = "Contact us at support@example.com and info@company.org";

        // Defining the regex pattern for matching email addresses
        String regex = "[A-Za-z0-9._+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";

        // Compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher to find occurrences of the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Iterating through all matches found in the text
        while (matcher.find()) {
            // Printing each matched email address
            System.out.println(matcher.group());
        }
    }
}
