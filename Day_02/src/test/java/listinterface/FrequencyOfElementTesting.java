package listinterface;

import org.collectionframwork.listinterface.frequencyofelement.FrequencyOfElements;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FrequencyOfElementTesting {
    @Test
    public void checkFrequency(){
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(12,12,13,14,1,3,12,14,5,6));
        FrequencyOfElements freq = new FrequencyOfElements();
        HashMap<Integer, Integer>hashMapForTest = freq.findFrequency(al);
        // Expected frequency map
        HashMap<Integer, Integer> expectedFrequency = new HashMap<>();
        expectedFrequency.put(12, 3);
        expectedFrequency.put(13, 1);
        expectedFrequency.put(14, 2);
        expectedFrequency.put(1, 1);
        expectedFrequency.put(3, 1);
        expectedFrequency.put(5, 1);
        expectedFrequency.put(6, 1);

        assertEquals(expectedFrequency,hashMapForTest);
        System.out.println("All Test Case Passes");

    }

    @Test
    public void testFrequencyOfStrings() {
        //Input List
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");

        //Expected Output
        HashMap<String, Integer> expectedFrequency = new HashMap<>();
        expectedFrequency.put("apple", 2);
        expectedFrequency.put("banana", 1);
        expectedFrequency.put("orange", 1);

        //Call the method
        FrequencyOfElements freq = new FrequencyOfElements();
        HashMap<String, Integer> actualFrequency = freq.findFrequency(inputList);

        //Validate the result
        assertEquals(expectedFrequency, actualFrequency);
        System.out.println("Test Case Passed ");
    }

}
