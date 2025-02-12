package queueinterface;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.collectionframwork.queueinterface.stackusingqueue.StackUsingQueues;

public class StackUsingQueue {
    @Test
    public void testStackOperations() {
        StackUsingQueues stack = new StackUsingQueues();

        // Stack should be empty initially
        assertTrue(stack.isEmpty());

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Top element should be 30
        assertEquals(30, stack.top());

        // Pop elements and check order
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());

        // Stack should be empty after popping all elements
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopOnEmptyStack() {
        StackUsingQueues stack = new StackUsingQueues();
        Exception exception = assertThrows(IllegalStateException.class, stack::pop);
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    public void testTopOnEmptyStack() {
        StackUsingQueues stack = new StackUsingQueues();
        Exception exception = assertThrows(IllegalStateException.class, stack::top);
        assertEquals("Stack is empty", exception.getMessage());
    }
}

