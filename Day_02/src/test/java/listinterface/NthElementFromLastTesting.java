package listinterface;

import org.collectionframwork.listinterface.nthelementfromlast.NthElementFromLast;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

public class NthElementFromLastTesting {

    @Test
    public void testFindNthFromEnd() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        String result = new NthElementFromLast().nthElementFromLast(list, 2);
        assertEquals("D", result, "The 2nd element from the end should be D.");
    }

    @Test
    public void testFindNthFromEnd_zero() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        assertThrows(IllegalArgumentException.class, () -> {
            new NthElementFromLast().nthElementFromLast(list, 0);
        });
    }

    @Test
    public void testFindNthFromEnd_largerThanSize() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        assertThrows(IllegalArgumentException.class, () -> {
            new NthElementFromLast().nthElementFromLast(list, 5);
        });
    }
}
