import org.collectionframwork.votingsystem.VotingOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class VotingSystemTest {
    private VotingOperations votingOperations;

    @BeforeEach
    void setUp() {
        votingOperations = new VotingOperations();
    }

    @Test
    void testVoteCounting() {
        // Voting by different people
        votingOperations.vote("Vivek");
        votingOperations.vote("Manisha");
        votingOperations.vote("Vivek"); // Vivek votes again

        HashMap<String, Integer> votes = votingOperations.getVoteMap();

        // Check vote count
        assertEquals(2, votes.get("Vivek").intValue());
        assertEquals(1, votes.get("Manisha").intValue());
        assertNull(votes.get("Ajay")); // Ajay hasn't voted
    }

    @Test
    void testVoteOrder() {
        // Cast votes in order
        votingOperations.vote("Vivek");
        votingOperations.vote("Manisha");
        votingOperations.vote("Ajay");
        votingOperations.vote("Vivek"); // Vivek votes again

        LinkedHashMap<String, Integer> voteOrder = votingOperations.getVoteOrder();

        // Verify the order of votes
        String[] expectedOrder = {"Vivek", "Manisha", "Ajay"};
        int i = 0;
        for (String candidate : voteOrder.keySet()) {
            assertEquals(expectedOrder[i], candidate);
            i++;
        }
    }

    @Test
    void testMultipleVotesBySamePerson() {
        votingOperations.vote("Manisha");
        votingOperations.vote("Manisha");
        votingOperations.vote("Manisha");

        HashMap<String, Integer> votes = votingOperations.getVoteMap();

        // Manisha voted 3 times
        assertEquals(3, votes.get("Manisha").intValue());
    }
}
