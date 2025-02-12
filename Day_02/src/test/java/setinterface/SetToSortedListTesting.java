package setinterface;

import org.collectionframwork.setinterface.settosortedlist.SetToSortedList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SetToSortedListTesting {
    @Test
    public void testConvertSetToList() {
        // Input Set
        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(11);
        inputSet.add(2);
        inputSet.add(3);
        inputSet.add(0);

        // Convert set to sorted list
        List<Integer> resultList = SetToSortedList.convertToSortedList(inputSet);

        // Expected sorted list
        List<Integer> expectedList = Arrays.asList(0, 2, 3, 11);

        // Assert the result is equal to the expected sorted list
        assertEquals(expectedList, resultList);
        System.out.println("TestCase Passed");
    }
}
