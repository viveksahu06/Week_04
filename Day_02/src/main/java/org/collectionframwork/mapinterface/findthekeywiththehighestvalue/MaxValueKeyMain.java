/*Find the Key with the Highest Value
Given a Map<String, Integer>, find the key with the maximum value.
Example:
Input: {A=10, B=20, C=15} → Output: B.*/
package org.collectionframwork.mapinterface.findthekeywiththehighestvalue;

import java.util.HashMap;
import java.util.Map;

public class MaxValueKeyMain {
    public static void main(String[] args) {
        // Defining the input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        // Finding the key with the highest value
        String maxKey = MaxValueKeyFinder.findMaxValueKey(inputMap);

        // Printing the result
        System.out.println("Key with highest value: " + maxKey);
    }
}
