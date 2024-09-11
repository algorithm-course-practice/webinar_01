package org.example.stage1;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();

        assertEquals(0, list.size());

        list.add("1");
        assertEquals("1", list.get(0));
        assertEquals(1, list.size());
        list.add("2");
        assertEquals("2", list.get(1));
        assertEquals(2, list.size());
        list.add("3");
        assertEquals("3", list.get(2));
        assertEquals(3, list.size());
        assertThrows(IllegalArgumentException.class, ()-> list.get(3));

        list.set(2, "33");
        assertEquals("33", list.get(2));
        assertThrows(IllegalArgumentException.class, ()-> list.set(3, ""));

        list.add("4");
        assertEquals(4, list.size());
        list.add("5");
        assertEquals(5, list.size());
        list.add("6");
        assertEquals(6, list.size());

        list.remove(0);
        assertEquals("2", list.get(0));
        assertEquals("33", list.get(1));

        assertEquals(5, list.size());
        list.remove(2);
        assertEquals("5", list.get(2));
        assertEquals(4, list.size());



    }

}