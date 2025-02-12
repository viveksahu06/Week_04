package org.collectionframwork.setinterface.symmetricdiffference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        //Add elements of set1 that are NOT in set2
        for (int num : set1) {
            if (!set2.contains(num)) {
                result.add(num);
            }
        }

        //Add elements of set2 that are NOT in set1
        for (int num : set2) {
            if (!set1.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
