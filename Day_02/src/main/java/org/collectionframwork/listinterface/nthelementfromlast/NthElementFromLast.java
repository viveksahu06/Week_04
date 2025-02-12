//Find the Nth Element from the End
//        Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
//        Example:
//        Input: [A, B, C, D, E], N=2 → Output: D
package org.collectionframwork.listinterface.nthelementfromlast;

import java.util.List;
import java.util.ListIterator;

public class NthElementFromLast {
    public <T> T nthElementFromLast(List<T> items, int positionFromLast){
        if (positionFromLast <= 0) {
            throw new IllegalArgumentException("Position must be greater than 0.");
        }
        //By using Hare tortoise method
        ListIterator<T> first = items.listIterator();
        ListIterator<T> second = items.listIterator();
        //make a distance between upto k
        for(int i=0;i<positionFromLast;i++){
            if(!first.hasNext()){
                throw new IllegalArgumentException("position is larger than size");
            }
            first.next();
        }
        //then moving both pointer till last
        while(first.hasNext()){
            first.next();
            second.next();
        }
        //now second pointer pointing to the element from last
        //return answer
        return second.next();
    }
}
