package org.collectionframwork.listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicateWithPreservingOrder remover = new RemoveDuplicateWithPreservingOrder();

        //Convert to an ArrayList to allow modification
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));

        //Using method 1: Iterating and checking manually
        List<Integer> result1 = remover.removeDuplicateWithOrder(numbers);
        System.out.println("Using removeDuplicateWithOrder: " + result1);

        //Reset input list
        numbers = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));

        //Using method 2: LinkedHashSet
        List<Integer> result2 = remover.removeDuplicate(numbers);
        System.out.println("Using removeDuplicate: " + result2);
    }
}
