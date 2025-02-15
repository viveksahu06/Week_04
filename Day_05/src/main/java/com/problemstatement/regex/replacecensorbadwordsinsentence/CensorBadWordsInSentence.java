package com.problemstatement.regex.replacecensorbadwordsinsentence;



public class CensorBadWordsInSentence {
    public static void main(String[] args) {
        // Defining the input text containing inappropriate words
        String text = "This is a damn bad example with some stupid words.";

        // Defining the regex pattern to match the words 'damn' or 'stupid' as whole words
        String regex = "\\b(damn|stupid)\\b";

        // Replacing all occurrences of the bad words with '****'
        String result = text.replaceAll(regex, "****");

        // Printing the original text
        System.out.println(text);

        // Printing the modified text with censored words
        System.out.println(result);
    }
}

