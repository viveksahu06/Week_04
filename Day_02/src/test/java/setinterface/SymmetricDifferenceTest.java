package setinterface;

import org.collectionframwork.setinterface.symmetricdiffference.SymmetricDifference;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SymmetricDifferenceTest {
    @Test
    public void test(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Compute the symmetric difference
        Set<Integer> result = SymmetricDifference.findSymmetricDifference(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));

        assertEquals(expected, result, "The symmetric difference is incorrect");

        // Example 2: Test symmetric difference when one set is empty
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set4 = new HashSet<>(Arrays.asList(1, 2));

        result = SymmetricDifference.findSymmetricDifference(set3, set4);
        expected = new HashSet<>(Arrays.asList(1, 2));

        assertEquals(expected, result, "The symmetric difference is incorrect when one set is empty");

        // Example 3: Test symmetric difference between two identical sets
        Set<Integer> set5 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set6 = new HashSet<>(Arrays.asList(1, 2, 3));

        result = SymmetricDifference.findSymmetricDifference(set5, set6);
        expected = new HashSet<>();  // No elements should remain in the symmetric difference

        assertEquals(expected, result, "The symmetric difference should be an empty set");
    }
}
