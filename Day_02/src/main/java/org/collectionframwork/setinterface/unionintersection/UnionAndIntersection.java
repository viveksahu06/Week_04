package org.collectionframwork.setinterface.unionintersection;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    //Method to find Union manually
    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {
        // Copy set1 into unionSet
        Set<Integer> unionSet = new HashSet<>(set1);

        for (int num : set2) {
            unionSet.add(num);
        }
        return unionSet;
    }

    // Method to find Intersection manually
    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                // If present in both sets, add to intersection
                intersectionSet.add(num);
            }
        }
        return intersectionSet;
    }
}
