package setinterface;

import org.collectionframwork.setinterface.subsetcheck.CheckSubSet;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubSetCheckTesting {
    @Test
    public void testIsSubset() {
        // Example 1: Set1 is a subset of Set2
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean result = CheckSubSet.isSubset(set1, set2);
        assertTrue(result, "Set1 should be a subset of Set2");

        // Example 2: Set3 is NOT a subset of Set4
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set4 = new HashSet<>(Arrays.asList(2, 3));

        result = CheckSubSet.isSubset(set3, set4);
        assertFalse(result, "Set3 should NOT be a subset of Set4"); // Corrected assertion

        // Example 3: Neither set is a subset of the other
        Set<Integer> set5 = new HashSet<>(Arrays.asList(5, 6));
        Set<Integer> set6 = new HashSet<>(Arrays.asList(1, 2, 3));

        result = CheckSubSet.isSubset(set5, set6);
        assertFalse(result, "Neither Set5 nor Set6 should be a subset of each other");
        System.out.println("All TestCase Passed");
    }
}
