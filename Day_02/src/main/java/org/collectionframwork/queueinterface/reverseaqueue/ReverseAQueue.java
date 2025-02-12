//Reverse a Queue
//        Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
//        Example:
//        Input: [10, 20, 30] → Output: [30, 20, 10].
package org.collectionframwork.queueinterface.reverseaqueue;

import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public <T> Queue<T> reverseAQueue(Queue<T> queue){
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
        return queue;
    }
}
