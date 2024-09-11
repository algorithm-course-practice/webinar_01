package org.example.stage1;

/**
 * Список основанный на связном списке
 *
 * @param <E>
 *
 * @see java.util.LinkedList
 */
public class MyLinkedList<E> implements MyList<E> {

    private Node<E> root = new Node<>(null);
    private Node<E> tail = root;

    private int size = 0;

    @Override
    public void add(E element) {
        Node<E> emptyNode = tail;

        if(emptyNode.value == null){
            emptyNode.value = element;
        }else{
            emptyNode.next = new Node<>(element);
            tail = emptyNode.next;
        }
        ++size;
    }

    @Override
    public E get(int index) {
        if(index >= size){
            throw  new IllegalArgumentException("invalid index");
        }
        Node<E> curr = root;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.value;
    }

    @Override
    public void set(int index, E element) {
        if(index >= size){
            throw  new IllegalArgumentException("invalid index");
        }
        Node<E> curr = root;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.value = element;
    }

    @Override
    public void remove(int index) {
        if(index >= size){
            throw  new IllegalArgumentException("invalid index");
        }
        if(index == 0){
            if(root.next != null){
                root = root.next;
            }else{
                root.value = null;
            }
        }else{
            Node<E> prev = root, curr = root.next;
            for (int i = 1; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
        }
        --size;
    }

    @Override
    public int size() {
        return size;
    }



    static class Node<E>{
        E value;
        Node<E> next;

        public Node(E element) {
            this.value = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + (next != null) +
                    '}';
        }
    }
}
