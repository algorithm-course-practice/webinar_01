package org.example.stage2;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedQueueTest {

    public static void main(String[] args) {
        MyQueue<String> queue = new MyLinkedQueue<>();

        assertEquals(0, queue.size());
        queue.add("first");
        assertEquals(1, queue.size());
        queue.add("second");
        assertEquals(2, queue.size());

        assertEquals("first", queue.remove());
        assertEquals(1, queue.size());
        assertEquals("second", queue.remove());
        assertEquals(0, queue.size());

    }

}