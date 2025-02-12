package org.collectionframwork.listinterface.nthelementfromlast;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        NthElementFromLast finder = new NthElementFromLast();

        //Creating a linked list with sample elements
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        // Find the 2nd element from the end
        int n = 2;
        try {
            String result = finder.nthElementFromLast(list, n);
            System.out.println("Nth element from the end: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}