package setinterface;

import org.collectionframwork.setinterface.unionintersection.UnionAndIntersection;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionIntersectionTest {
    @Test
    public void testUnionOfSets() {
        // Test union of two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Union of set1 and set2
        Set<Integer> result = UnionAndIntersection.findUnion(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        assertEquals(expected, result, "The union of the sets is incorrect.");
    }

    @Test
    public void testIntersectionOfSets() {
        // Test intersection of two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Intersection of set1 and set2
        Set<Integer> result = UnionAndIntersection.findIntersection(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(3));

        assertEquals(expected, result, "The intersection of the sets is incorrect.");
    }
}
