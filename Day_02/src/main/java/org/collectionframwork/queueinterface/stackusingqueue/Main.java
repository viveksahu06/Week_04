package org.collectionframwork.queueinterface.stackusingqueue;

public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        //Push operations
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //Pop operation
        System.out.println("Push 1, 2, 3 → Pop →Output: " + stack.pop());
    }
}