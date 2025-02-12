package org.collectionframwork.mapinterface.findthekeywiththehighestvalue;

import java.util.Map;

public class MaxValueKeyFinder {

    // Defining a method for finding the key with the highest value
    public static String findMaxValueKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null; // Handling empty or null map
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Iterating through each entry in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        // Returning the key with the highest value
        return maxKey;
    }
}
