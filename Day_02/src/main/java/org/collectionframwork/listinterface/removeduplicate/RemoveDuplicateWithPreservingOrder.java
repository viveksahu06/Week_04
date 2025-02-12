//Remove Duplicates While Preserving Order
//Remove duplicate elements from a list while maintaining the original order of elements.
//Example:
//Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].

package org.collectionframwork.listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWithPreservingOrder {
    //method to remove duplicate with insertion order
    public <T> List<T> removeDuplicateWithOrder(List<T> data){
        //New list to store element in insertion order
        List<T> newList = new ArrayList<>();
        //iterating over list
        for(T items : data){
            //new list doesn't contain element just add
            if(!newList.contains(items)){
                newList.add(items);
            }
        }
        //return unique list
        return newList;
    }

    //Alternate way By using LinkedHashSet
    public <T> List<T> removeDuplicate(List<T>items){
        //Using this Data Structure we maintain insertion order
        Set<T> set = new LinkedHashSet<>(items);
        //remove all element from list
        items.clear();
        //add all element to list
        items.addAll(set);

        //return list who is having unique element
        return items;
    }

}
