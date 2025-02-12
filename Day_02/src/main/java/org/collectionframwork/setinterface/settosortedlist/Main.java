package org.collectionframwork.setinterface.settosortedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.collectionframwork.setinterface.settosortedlist.SetToSortedList.convertToSortedList;

public class Main {
    public static void main(String[] args) {
        //Create and populate HashSet
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println(set);
        //Convert to sorted list
        List<Integer> sortedList = convertToSortedList(set);

        //Print result

        System.out.println("Output: " + sortedList);
    }
}
