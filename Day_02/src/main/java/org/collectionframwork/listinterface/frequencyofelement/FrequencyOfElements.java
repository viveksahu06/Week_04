//Find Frequency of Elements
//Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
//        Example:
//Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
package org.collectionframwork.listinterface.frequencyofelement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {
    public <T> HashMap<T,Integer> findFrequency(List<T> items){
        //Map to store frequency in key value pair
        HashMap<T, Integer> hashMap = new HashMap<>();
        //loop to iterating hashmap
        for(T item : items){
            hashMap.put(item, hashMap.getOrDefault(item, 0)+1);
        }
        return hashMap;
    }
}
