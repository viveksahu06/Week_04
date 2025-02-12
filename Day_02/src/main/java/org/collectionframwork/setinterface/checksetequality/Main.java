package org.collectionframwork.setinterface.checksetequality;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Creating first set with elements
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        //Creating second set with the same elements but in a different order
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        //Creating third set with different elements {1, 2, 4}
        Set<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(4);

        //Creating an object of CompareTwoSetEquality to use its methods
        CompareTwoSetEquality checker = new CompareTwoSetEquality();

        //Checking equality using manual approach (without inbuilt methods)
        System.out.println("Using manual approach (set1 vs set2): " + checker.checkSetEqualityManual(set1, set2));
        System.out.println("Using manual approach (set1 vs set3): " + checker.checkSetEqualityManual(set1, set3));

        //Checking equality using equals() method
        System.out.println("Using equals method (set1 vs set2): " + checker.checkSetEquality(set1, set2));
        System.out.println("Using equals method (set1 vs set3): " + checker.checkSetEquality(set1, set3));

        //Checking equality using containsAll() method
        System.out.println("Using containsAll method (set1 vs set2): " + checker.checkSetEqualityByContainsAll(set1, set2));
        System.out.println("Using containsAll method (set1 vs set3): " + checker.checkSetEqualityByContainsAll(set1, set3));
    }

}
