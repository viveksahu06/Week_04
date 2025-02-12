package mapinterface;

import org.collectionframwork.mapinterface.invertmap.InvertMap;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class InvertMapTest {
    @Test
    public void testInvertMap() {
        // Input map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Expected inverted map
        Map<Integer, List<String>> expectedInvertedMap = new HashMap<>();
        expectedInvertedMap.put(1, Arrays.asList("A", "C"));
        expectedInvertedMap.put(2, Collections.singletonList("B"));

        // Invert the map
        Map<Integer, List<String>> invertedMap = InvertMap.invertMap(originalMap);

        // Assert that the inverted map matches the expected result
        assertEquals(expectedInvertedMap, invertedMap);
    }
}
