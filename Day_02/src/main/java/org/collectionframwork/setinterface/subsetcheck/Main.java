package org.collectionframwork.setinterface.subsetcheck;

import java.util.HashSet;
import java.util.Set;

import static org.collectionframwork.setinterface.subsetcheck.CheckSubSet.isSubset;

public class Main {
    public static void main(String[] args) {
        // Define sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to sets
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Check subset condition
        System.out.println("answer " + isSubset(set1, set2));
    }
}
