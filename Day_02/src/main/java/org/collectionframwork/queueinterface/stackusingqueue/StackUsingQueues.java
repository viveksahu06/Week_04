package org.collectionframwork.queueinterface.stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

//Stack implemented using two queues
class StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(int x) {
        queue1.add(x);
    }

    // Remove and return the top element of the stack
    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        // Move all elements except last to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int topElement = queue1.poll();

        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Get the top element without removing it
    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int topElement = queue1.peek();
        queue2.add(queue1.poll());

        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}