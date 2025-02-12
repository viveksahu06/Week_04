package org.collectionframwork.queueinterface.reverseaqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Creating a queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        //Printing the original queue
        System.out.println("Original Queue: " + queue);

        //Creating an object of ReverseQueue to call the reverseAQueue method
        ReverseAQueue rq = new ReverseAQueue();

        //Reversing the queue
        Queue<Integer> reversedQueue = rq.reverseAQueue(queue);

        //Printing the reversed queue
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}

