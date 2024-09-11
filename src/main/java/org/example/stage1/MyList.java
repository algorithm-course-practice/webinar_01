package org.example.stage1;

/**
 * Базовый интерфейс списка
 * @param <E>
 * @see java.util.List
 */
public interface MyList<E> {

    void add(E element);

    E get(int index);

    void set(int index, E element);

    void remove(int index);

    int size();

}
