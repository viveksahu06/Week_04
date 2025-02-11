package org.collectionframwork.listinterface.reverselist;

import java.util.*;

public class ReverseAList {
    public static void main(String[] args) {
        //Testing with ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ByUsingArrayList arrayListReverser = new ByUsingArrayList();

        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Reversed (New List): " + arrayListReverser.reverseAListUsingReversing(new ArrayList<>(arrayList)));
        System.out.println("Reversed (Two Pointer, In-Place): " + arrayListReverser.reverseAListUsingTwoPointer(new ArrayList<>(arrayList)));
        System.out.println("Reversed (ListIterator): " + arrayListReverser.reverseAListUsingListIterator(new ArrayList<>(arrayList)));
        System.out.println("Reversed (Stack): " + arrayListReverser.reverseUsingStack(new ArrayList<>(arrayList)));

        System.out.println("*************************************************");

        //Testing with LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        ByUsingLinkedList linkedListReverser = new ByUsingLinkedList();

        System.out.println("Original LinkedList: " + linkedList);
        System.out.println("Reversed (New List): " + linkedListReverser.reverseAListUsingReverse(new LinkedList<>(linkedList)));
        System.out.println("Reversed (Two Pointer, In-Place): " + linkedListReverser.reverseAListUsingTwoPointer(new LinkedList<>(linkedList)));
        System.out.println("Reversed (ListIterator): " + linkedListReverser.reverseUsingListIterator(new LinkedList<>(linkedList)));
        System.out.println("Reversed (Stack): " + linkedListReverser.reverseUsingStack(new LinkedList<>(linkedList)));
        System.out.println("Reversed (Deque): " + linkedListReverser.reverseUsingDeque(new LinkedList<>(linkedList)));




    }
}
