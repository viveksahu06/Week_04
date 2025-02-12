package org.collectionframwork.setinterface.symmetricdiffference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.collectionframwork.setinterface.symmetricdiffference.SymmetricDifference.findSymmetricDifference;

public class Main {
    public static void main(String[] args) {
        //sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Find symmetric difference
        Set<Integer> symmetricDiff = findSymmetricDifference(set1, set2);

        // Print result
        System.out.println("Output: " + symmetricDiff);
    }
}
