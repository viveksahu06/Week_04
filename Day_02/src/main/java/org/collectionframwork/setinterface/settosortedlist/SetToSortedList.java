package org.collectionframwork.setinterface.settosortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SetToSortedList {
    //Method to convert HashSet to a sorted List
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList); // Sort in ascending order
        return sortedList;

    }
}
