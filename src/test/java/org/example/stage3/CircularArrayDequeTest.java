package org.example.stage3;

import static org.junit.jupiter.api.Assertions.*;

class CircularArrayDequeTest {
    public static void main(String[] args) {
        MyDeque<String> deque = new CircularArrayDeque(3);

        assertEquals(0, deque.size());
        assertTrue(deque.add("first"));
        assertEquals(1, deque.size());
        assertTrue(deque.add("second"));
        assertEquals(2, deque.size());
        assertTrue(deque.add("third"));
        assertEquals(3, deque.size());
        assertFalse(deque.add("notEnq"));
        assertEquals(3, deque.size());

        assertEquals("first", deque.remove());
        assertEquals(2, deque.size());
        assertEquals("second", deque.remove());
        assertEquals(1, deque.size());

        assertTrue(deque.add("new element"));
        assertEquals(2, deque.size());
        deque.remove();

        for (int i = 0; i < 10; i++) {
            deque.remove();
            assertEquals(0, deque.size());
            deque.add(String.valueOf(i));
            assertEquals(1, deque.size());
        }

        deque = new CircularArrayDeque<>(3);
        assertEquals(0, deque.size());
        assertTrue(deque.addFirst("first"));
        assertEquals(1, deque.size());
        assertTrue(deque.addFirst("second"));
        assertEquals(2, deque.size());
        assertTrue(deque.addFirst("third"));

        assertEquals(3, deque.size());
        assertFalse(deque.addFirst("first"));
        assertEquals(3, deque.size());

        assertEquals("third", deque.remove());
        assertEquals("second", deque.remove());
        assertEquals("first", deque.remove());


        assertTrue(deque.add("first"));
        assertTrue(deque.add("second"));
        assertTrue(deque.add("third"));

        assertEquals("third", deque.removeLast());
        assertEquals("second", deque.removeLast());
        assertEquals("first", deque.removeLast());



    }

}