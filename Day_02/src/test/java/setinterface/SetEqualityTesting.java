package setinterface;

import org.collectionframwork.setinterface.checksetequality.CompareTwoSetEquality;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SetEqualityTesting {
    @Test
    public void testSetsAreEqual() {
        // Set 1 and Set 2 are equal (same elements, same order)
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        // Assert sets are equal (order does not matter)
        assertTrue(CompareTwoSetEquality.checkSetEqualityManual(set1, set2));
        System.out.println("TestCase Passed");
    }
    @Test
    public void testSetsAreNotEqual() {
        // Set 1 and Set 2 are not equal (different elements)
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(4);
        set2.add(2);
        set2.add(1);

        // Assert sets are not equal
        assertFalse(CompareTwoSetEquality.checkSetEqualityManual(set1, set2));
        System.out.println("TestCase Passed");
    }
}
