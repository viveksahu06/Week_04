package org.collectionframwork.setinterface.unionintersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.collectionframwork.setinterface.unionintersection.UnionAndIntersection.findIntersection;
import static org.collectionframwork.setinterface.unionintersection.UnionAndIntersection.findUnion;

public class Main {
    public static void main(String[] args) {
        // Define sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Compute Union and Intersection
        Set<Integer> union = findUnion(set1, set2);
        Set<Integer> intersection = findIntersection(set1, set2);

        // Print results
        System.out.println(" Union: " + union + ", Intersection: " + intersection);
    }
}
