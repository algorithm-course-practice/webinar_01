package org.example.stage3;

/**
 * Реализация двусторонней очереди на цикличном массиве фиксированной длины
 *
 * @param <E>
 * @see java.util.ArrayDeque
 */
public class CircularArrayDeque<E> implements MyDeque<E> {

    private E[] array;
    private int head;
    private int tail;
    private int size;

    public CircularArrayDeque(int capacity) {
        array = (E[]) new Object[capacity];
    }


    //  h
    // [0] [] [1]
    // t

    @Override
    public boolean add(E element) {
        if (tail == head && array[tail] != null) { // либо size >= array.length
            return false;
        }
        array[tail] = element;
        tail = ++tail % array.length;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if (array[head] == null) {
            return null;
        }
        E res = array[head];
        array[head] = null;
        head = ++head % array.length;
        size--;
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean addFirst(E element) {
        if (size >= array.length) {
            return false;
        }
        if (array[head] == null) {
            array[head] = element;
        } else {
            head = --head < 0 ? array.length - 1 : head;
            array[head] = element;
        }
        ++size;

        return true;
    }

    @Override
    public E removeLast() {
        tail = --tail < 0 ? array.length - 1 : tail;
        if (array[tail] == null) {
            return null;
        }

        E res = array[tail];
        array[tail] = null;

        --size;
        return res;
    }
}
