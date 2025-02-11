package org.collectionframwork.listinterface.frequencyofelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //ArrayList type Integer
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,2,5,4,6,7,5));

        FrequencyOfElements frequencyOfElements = new FrequencyOfElements();
        //HashMap to store frequency of elements
        HashMap<Integer,Integer> freq =frequencyOfElements.findFrequency(arrayList);
        //Displaying the result
        System.out.println(freq);

        //ArrayList type String
        ArrayList<String>al = new ArrayList<>(Arrays.asList("banana", "apple", "banana", "guava"));
        //HashMap to store frequency of element
        HashMap<String,Integer> frequency =frequencyOfElements.findFrequency(al);
        //Displaying the result
        System.out.println(frequency);
    }
}
