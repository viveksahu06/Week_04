/*Invert a Map
Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.
Example:
Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
*/
package org.collectionframwork.mapinterface.invertmap;

import java.util.*;

public class InvertMapMain {
    public static void main(String[] args) {
        // Defining the input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        // Calling the invert method
        Map<Integer, List<String>> invertedMap = InvertMap.invertMap(inputMap);

        // Printing the inverted map
        System.out.println("Inverted Map: " + invertedMap);
    }
}
