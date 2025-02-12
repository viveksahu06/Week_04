package org.collectionframwork.mapinterface.invertmap;

import java.util.*;

public class InvertMap {

    // Defining a method for inverting a map while handling duplicate values
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        // Iterating through each entry in the original map
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // Storing duplicate values in a list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        // Returning the inverted map
        return invertedMap;
    }
}
