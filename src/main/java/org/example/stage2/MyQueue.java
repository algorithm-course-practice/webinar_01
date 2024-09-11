package org.example.stage2;

/**
 * Базовый интерфейс First-In-First-Out (FIFO) очереди
 * @param <E>
 * @see java.util.Queue
 */
public interface MyQueue<E> {

    boolean add(E element);

    E remove();

    int size();
}
