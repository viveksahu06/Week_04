package org.collectionframwork.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class ByUsingArrayList {
    //method 1 to reverse a list by using another list
    public <T> ArrayList<T> reverseAListUsingReversing(ArrayList<T> arrayList){
        ArrayList<T> reverseList = new ArrayList<T>();
        for(int i = arrayList.size()-1; i>=0; i--){
            reverseList.add(arrayList.get(i));
        }
        return reverseList;
    }

    //method 2 to reverse a list without using another extra space
    public <T> ArrayList<T> reverseAListUsingTwoPointer(ArrayList<T> arrayList){
        for(int i=0;i<arrayList.size()/2; i++){
            T temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size()-1-i));
            arrayList.set(arrayList.size()-1-i, temp);
        }

        return arrayList;
    }

    //method 3 to reverse a list using listIterator
    public <T> ArrayList<T> reverseAListUsingListIterator(ArrayList<T>arrayList){
        ArrayList<T> reversedList = new ArrayList<>();
        ListIterator<T> iterator = arrayList.listIterator(arrayList.size());

        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        return reversedList;
    }

    //reversing a list using stack
    public <T> ArrayList<T> reverseUsingStack(ArrayList<T> list) {
        Stack<T> stack = new Stack<>();
        for (T item : list) {
            stack.push(item);
        }

        ArrayList<T> reversedList = new ArrayList<>();
        while (!stack.isEmpty()) {
            reversedList.add(stack.pop());
        }
        return reversedList;
    }
}
