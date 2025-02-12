/*Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}*/
package org.collectionframwork.mapinterface.wordfrequencycounter;

import java.util.Map;

public class WordFrequencyMain {
    public static void main(String[] args) {
        // Defining the file path for reading input
        String filePath = "1mb-examplefile-com.txt";

        //Calling the word frequency counting method
        Map<String, Integer> wordCount = WordFrequencyCounter.countWordFrequency(filePath);

        //Printing the word frequency count
        System.out.println("Word Frequency Count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
