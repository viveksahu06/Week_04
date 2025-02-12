package queueinterface;

import org.collectionframwork.queueinterface.reverseaqueue.ReverseAQueue;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestReverseAQueue {

    @Test
    public void testReverseQueue() {
        // Test case 1: Reversing a queue with multiple elements
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);

        ReverseAQueue reverseAQueue = new ReverseAQueue();
        reverseAQueue.reverseAQueue(queue1);

        // After reversal, the queue should be [30, 20, 10]
        assertEquals(30, queue1.poll());
        assertEquals(20, queue1.poll());
        assertEquals(10, queue1.poll());

        // Ensure the queue is now empty
        assertTrue(queue1.isEmpty());
    }

    @Test
    public void testReverseEmptyQueue() {
        Queue<Integer> queue2 = new LinkedList<>();
        ReverseAQueue reverseAQueue = new ReverseAQueue();
        reverseAQueue.reverseAQueue(queue2);

        // Empty queue should remain empty
        assertTrue(queue2.isEmpty());
    }

    @Test
    public void testReverseSingleElementQueue() {
        Queue<Integer> queue3 = new LinkedList<>();
        queue3.add(100);

        ReverseAQueue reverseAQueue = new ReverseAQueue();
        reverseAQueue.reverseAQueue(queue3);

        // After reversal, the queue should still contain the same single element
        assertEquals(100, queue3.poll());

        // Ensure the queue is now empty
        assertTrue(queue3.isEmpty());
    }
}
