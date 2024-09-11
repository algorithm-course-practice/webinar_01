package org.example.stage1;

/**
 * Список основанный на массиве.
 * @param <E>
 * @see java.util.ArrayList
 */
public class MyArrayList<E> implements MyList<E> {

    private int capacity;

    private E[] array;

    private int tail;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.tail = 0;
        array = (E[]) new Object[capacity];
    }

    @Override
    public void add(E element) {
        if(tail == capacity){
            throw new IllegalStateException("list is full");
        }
        array[tail++] = element;
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= tail){
            throw new IllegalArgumentException("invalid index");
        }
        return array[index];
    }

    @Override
    public void set(int index, E element) {
        if(index < 0 || index >= tail){
            throw new IllegalArgumentException("invalid index");
        }
        array[index] = element;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= tail){
            throw new IllegalArgumentException("invalid index");
        }
        int limit = capacity - 1;
        for(int pos = index; pos < tail && pos < limit; ++pos){
            array[pos] = array[pos+1];
        }
        array[--tail] = null;
    }

    @Override
    public int size() {
        return tail;
    }
}
