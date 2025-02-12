package listinterface;

import org.collectionframwork.listinterface.removeduplicate.RemoveDuplicateWithPreservingOrder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateTesting {
    @Test
    public void testRemoveDuplicate(){
        List<Integer> input = new ArrayList<>();

        // Add into ist
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(2);

        // Add in expected list
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));



        // Test if the removal of element into  list is correct or not
        List<Integer> result = new RemoveDuplicateWithPreservingOrder().removeDuplicate(input);

        //By method 2
        List<Integer> result2 = new RemoveDuplicateWithPreservingOrder().removeDuplicateWithOrder(input);
        assertEquals(result , expected);
        assertEquals(result2,expected);
        System.out.println("Test Case Passed");
    }
}
