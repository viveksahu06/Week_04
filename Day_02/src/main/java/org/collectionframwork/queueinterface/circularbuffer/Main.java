package org.collectionframwork.queueinterface.circularbuffer;

public class Main {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        // Insert elements
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.enqueue(4);

        // Print final buffer state
        buffer.printBuffer();
    }
}