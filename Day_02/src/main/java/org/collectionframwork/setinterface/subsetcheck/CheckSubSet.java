package org.collectionframwork.setinterface.subsetcheck;

import java.util.Set;

public class CheckSubSet {
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }

}
