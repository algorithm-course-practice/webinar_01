package org.example.stage2;


/**
 * Очередь FIFO на связном списке
 *
 * @param <E>
 */
public class MyLinkedQueue<E> implements MyQueue<E> {

    private Node<E> head = new Node<>(null);
    private Node<E> tail = new Node<>(null);
    private int size = 0;

    public MyLinkedQueue() {
        tail.next = head;
        head.prev = tail;
    }

    // tail Xprev N next   rev N next      prev N nextX  head

    @Override
    public boolean add(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.prev = tail;
        newNode.next = tail.next;
        tail.next = newNode;
        newNode.next.prev = newNode;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if(size == 0){
            return null;
        }
        Node<E> removeNode = head.prev;

        removeNode.next.prev = removeNode.prev;
        removeNode.prev.next = removeNode.next;
        size--;
        return removeNode.value;
    }

    @Override
    public int size() {
        return size;
    }

    static class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        public Node(E value) {
            this.value = value;
        }
    }
}
