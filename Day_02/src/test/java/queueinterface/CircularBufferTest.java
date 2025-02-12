package queueinterface;
import org.collectionframwork.queueinterface.circularbuffer.CircularBuffer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    @Test
    public void testEnqueueAndBufferState() {
        CircularBuffer buffer = new CircularBuffer(3); // Buffer size = 3

        // Enqueue elements
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);

        // Expected buffer state: [1, 2, 3]
        assertArrayEquals(new int[]{1, 2, 3}, buffer.getBuffer(), "Buffer should contain [1, 2, 3]");

        // Add one more element (should overwrite the oldest element '1')
        buffer.enqueue(4);

        // Expected buffer state: [2, 3, 4] (FIFO, oldest element removed)
        assertArrayEquals(new int[]{2, 3, 4}, buffer.getBuffer(), "Buffer should contain [2, 3, 4] after overflow");

        // Add another element, '5' (should overwrite '2')
        buffer.enqueue(5);

        // Expected buffer state: [3, 4, 5]
        assertArrayEquals(new int[]{3, 4, 5}, buffer.getBuffer(), "Buffer should contain [3, 4, 5] after another overflow");
    }
}
