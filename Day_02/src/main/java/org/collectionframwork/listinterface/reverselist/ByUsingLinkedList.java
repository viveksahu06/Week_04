package org.collectionframwork.listinterface.reverselist;

import java.util.*;

public class ByUsingLinkedList {
    //method 1 to reverse a list by using another list
    public <T> LinkedList<T> reverseAListUsingReverse(LinkedList<T> linkedList){
        LinkedList<T> reverseList = new LinkedList<>();
        for(int i = linkedList.size()-1; i>=0; i--){
            reverseList.add(linkedList.get(i));
        }
        return reverseList;
    }

    //method 2 to reverse a list without using another extra space
    public <T> LinkedList<T> reverseAListUsingTwoPointer(LinkedList<T> linkedList){
        for(int i=0;i<linkedList.size()/2; i++){
            T temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size()-1-i));
            linkedList.set(linkedList.size()-1-i, temp);
        }

        return linkedList;
    }

    //method 3 to reverse a list using listIterator
    public <T> LinkedList<T> reverseUsingListIterator(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        ListIterator<T> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        return reversedList;
    }
    //reversing a list using stack
    public <T> LinkedList<T> reverseUsingStack(LinkedList<T> list) {
        Stack<T> stack = new Stack<>();
        for (T item : list) {
            stack.push(item);
        }

        LinkedList<T> reversedList = new LinkedList<>();
        while (!stack.isEmpty()) {
            reversedList.add(stack.pop());
        }
        return reversedList;
    }

    // reversing a list using deque
    public<T> LinkedList<T> reverseUsingDeque(LinkedList<T> list) {
        Deque<T> deque = new ArrayDeque<>(list);
        LinkedList<T> reversedList = new LinkedList<>();
        while (!deque.isEmpty()) {
            reversedList.add(deque.removeLast());
        }
        return reversedList;
    }
}
