package org.collectionframwork.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class VotingOperations {
    // Stores candidate votes
    private HashMap<String, Integer> voteMap;
    // Maintains vote order
    private LinkedHashMap<String, Integer> voteOrder;

    public VotingOperations() {
        voteMap = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
    }

    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteMap.get(candidate));
    }
    //method to display get voting map
    public HashMap<String, Integer> getVoteMap() {
        return voteMap;
    }
    //method to get voting order
    public LinkedHashMap<String, Integer> getVoteOrder() {
        return voteOrder;
    }
}
