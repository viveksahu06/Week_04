package listinterface;

import org.collectionframwork.listinterface.reverselist.ByUsingArrayList;
import org.collectionframwork.listinterface.reverselist.ByUsingLinkedList;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class ReverseAListTesting {

    @Test
    public void reverseTestingForInteger() {
        //Testing for ArrayList
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2, 3, 4, 1, 6, 9, 7));

        // Expected reversed output
        ArrayList<Integer> expectedReverse = new ArrayList<>(Arrays.asList(7, 9, 6, 1, 4, 3, 2));

        // Call the reverse function
        ByUsingArrayList reverser = new ByUsingArrayList();
        ArrayList<Integer> actualReverse = reverser.reverseAListUsingReversing(new ArrayList<>(al));

        // Assert the result
        assertEquals(expectedReverse, actualReverse);
        System.out.println("Testing passes for ArrayList");

        //Testing for LinkedList
        ByUsingLinkedList reversed = new ByUsingLinkedList();
        LinkedList<Integer>ll = new LinkedList<>(Arrays.asList(2, 3, 4, 1, 6, 9, 7));
        // Expected reversed output
        LinkedList<Integer>expectedRev = new LinkedList<>(Arrays.asList(7, 9, 6, 1, 4, 3, 2));

        LinkedList<Integer>actual =reversed.reverseAListUsingReverse(new LinkedList<>(ll));
        assertEquals(actual , expectedRev);
        System.out.println("Testing passes for LinkedList");

    }

    @Test
    public void reverseTestingForString(){
        //Testing for ArrayList
        ArrayList<String> al = new ArrayList<>(Arrays.asList("vivek", "vinay","vikas","saurabh", "vinisha"));

        // Expected reversed output
        ArrayList<String> expectedReverse = new ArrayList<>(Arrays.asList("vinisha","saurabh", "vikas", "vinay", "vivek"));

        // Call the reverse function
        ByUsingArrayList reverser = new ByUsingArrayList();
        ArrayList<String> actualReverse = reverser.reverseAListUsingListIterator(new ArrayList<>(al));

        // Assert the result
        assertEquals(expectedReverse, actualReverse);
        System.out.println("Testing passes for ArrayList");

        //Testing for LinkedList
        ByUsingLinkedList reversed = new ByUsingLinkedList();
        LinkedList<String>ll = new LinkedList<>(Arrays.asList("vivek", "vinay","vikas","saurabh", "vinisha"));
        // Expected reversed output
        LinkedList<String>expectedRev = new LinkedList<>(Arrays.asList("vinisha","saurabh", "vikas", "vinay", "vivek"));

        LinkedList<String>actual =reversed.reverseUsingListIterator(new LinkedList<>(ll));
        assertEquals(actual , expectedRev);
        System.out.println("Testing passes for LinkedList");
    }

}
