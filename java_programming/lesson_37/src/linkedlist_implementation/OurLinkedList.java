package linkedlist_implementation;

import java.util.Iterator;

public class OurLinkedList<E> implements OurList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public OurLinkedList() {
    }

    @Override
    public void append(E value) {
        Node<E> newNode;
        if (size > 0) {
            newNode = new Node<>(null, last, value);
            last.next = newNode;
        } else {
            newNode = new Node<>(null, null, value);
            first = newNode;
        }
        last = newNode;
        size++;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E o) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public boolean remove(E o) {
        return false;
    }

    @Override
    public E removeById(int index) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private static class Node<E> {
        Node<E> next;
        Node<E> prev;
        E value;
        Node() {
        }
        Node(Node<E> next, Node<E> prev, E value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
}
