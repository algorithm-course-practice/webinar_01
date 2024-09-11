package org.example.stage3;

import org.example.stage2.MyQueue;

/**
 * Базовый интерфейс двусторонней очереди
 * @param <E>
 *
 * @see java.util.Deque
 */
public interface MyDeque<E> extends MyQueue<E> {

    boolean addFirst(E element);

    E removeLast();
}
