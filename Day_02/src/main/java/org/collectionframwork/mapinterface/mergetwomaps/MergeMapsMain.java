/*Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.
Example:
Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.*/
package org.collectionframwork.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;
public class MergeMapsMain {
    public static void main(String[] args) {
        // Defining the first map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Defining the second map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merging the two maps
        Map<String, Integer> mergedMap = MergeMaps.mergeTwoMaps(map1, map2);

        // Printing the merged map
        System.out.println("Merged Map: " + mergedMap);
    }
}
