package org.example.stage1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {




    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>(5);
        assertEquals(0, list.size());
        list.add("1");
        assertEquals(1, list.size());
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        assertEquals(5, list.size());

        assertEquals("1", list.get(0));
        assertEquals("5", list.get(4));

        list.set(4, "10");
        assertEquals("10", list.get(4));

        list.remove(0);
        assertEquals(4, list.size());
        assertEquals("2", list.get(0));
        list.add("last");

    }
    @Test
    void add() {

    }

    @Test
    void get() {
    }

    @Test
    void set() {
    }

    @Test
    void remove() {
    }

    @Test
    void size() {
    }
}