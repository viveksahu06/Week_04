//Design a Voting System
//Description: Design a system where:
//Votes are stored in a HashMap (Candidate -> Votes).
//TreeMap is used to display the results in sorted order.
//LinkedHashMap is used to maintain the order of votes.

package org.collectionframwork.votingsystem;

public class Main {
    public static void main(String[] args) {
        VotingOperations ope = new VotingOperations();
        ope.vote("Alice");
        ope.vote("Bob");
        ope.vote("Alice");

        VoteDisplay.displayResults(ope.getVoteMap());
    }
}