package mapinterface;

import org.collectionframwork.mapinterface.wordfrequencycounter.WordFrequencyCounter;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapFrequencyTest {
    @Test
    public void testCountWordFrequency() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("test", ".txt");
        tempFile.deleteOnExit();
        // Ensure the file is deleted after the test

        // Write sample content to the file
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("Hello world, hello Java! Hello world.");
        }

        // Call the method to count word frequencies from the file
        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency(tempFile.getAbsolutePath());

        // Expected word frequency map
        Map<String, Integer> expected = Map.of(
                "hello", 3,
                "world", 2,
                "java", 1
        );

        // Verify the result matches the expected map
        assertEquals(expected, result);
    }
}
