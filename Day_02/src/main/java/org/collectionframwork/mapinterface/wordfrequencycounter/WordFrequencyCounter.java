package org.collectionframwork.mapinterface.wordfrequencycounter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    // Defining a method for counting word frequency from a file
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Reading the file using BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Iterating through each line of the file
            while ((line = br.readLine()) != null) {
                // Removing punctuation and converting to lowercase
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

                // Splitting words by spaces
                String[] words = line.split("\\s+");

                // Iterating through words and updating frequency count
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            // Printing an error message if file reading fails
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Returning the word frequency map
        return wordCount;
    }
}
