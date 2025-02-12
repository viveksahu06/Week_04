package queueinterface;

import org.collectionframwork.queueinterface.generatingbinarynumber.GeneratingBinaryNumber;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class GenerateBinaryTest {
    @Test
    public void testGenerateBinary() {
        // Define the expected result for generating the first 5 binary numbers
        Queue<String> expected = new LinkedList<>();
        expected.add("1");
        expected.add("10");
        expected.add("11");
        expected.add("100");
        expected.add("101");

        // Call the method that generates binary numbers
        GeneratingBinaryNumber g= new GeneratingBinaryNumber();
        List<String> actual = g.generateBinaryNumbers(5);

        // Assert that the actual result matches the expected result
        assertEquals(expected, actual);
    }
}
