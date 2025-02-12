//Check if Two Sets Are Equal
//Compare two sets and determine if they contain the same elements, regardless of order.
//Example:
//Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.
package org.collectionframwork.setinterface.checksetequality;

import java.util.Set;

public class CompareTwoSetEquality {
    //Without using inbuilt method
    public static <T> boolean checkSetEqualityManual(Set<T> set1, Set<T> set2) {
        //Compare sizes
        if (set1.size() != set2.size()) {
            return false;
        }

        //Check if all elements of set1 exist in set2
        for (T element1 : set1) {
            boolean found = false;
            for (T element2 : set2) {
                if (element1.equals(element2)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }

        return true;
    }
    //by using equals method
    public <T> boolean checkSetEquality(Set<T>set1, Set<T>set2){
        //if the size is not equal they are not equal
        if(set1.size() != set2.size()){
            return false;
        }
        return set1.equals(set2);
    }

    //by using containsAll
    public <T> boolean checkSetEqualityByContainsAll(Set<T>set1, Set<T>set2){
        //if the size is not equal they are not equal
        if(set1.size() != set2.size()){
            return false;
        }
        return set1.containsAll(set2) && set2.containsAll(set1);
    }
}
