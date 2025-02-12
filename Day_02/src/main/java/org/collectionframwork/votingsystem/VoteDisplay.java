package org.collectionframwork.votingsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class VoteDisplay {
    //method to displaty the votes
    public static void displayResults(HashMap<String, Integer> voteMap) {
        TreeMap<String, Integer> sortedVotes = new TreeMap<>(voteMap);

        System.out.println("Election Results:");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}