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
            newNode = new Node<>(last, value, null);
            last.next = newNode;
        } else {
            newNode = new Node<>(null, value, null);
            first = newNode;
        }
        last = newNode;
        size++;
    }

    private Node<E> getNodeByIndex(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        int currentIndex = 0;
        Node<E> currentNode = first;
        while (currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        return currentNode;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return getNodeByIndex(index).value;
    }

    @Override
    public void set(int index, E value) {
        if (index >= size || index < 0) {
            return;
        }
        Node<E> node = getNodeByIndex(index);
        node.value = value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E value) {
        Node<E> currentNode = first;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    private Node<E> getNodeByValue(E value) {
        Node<E> currentNode = first;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    private E removeNode(Node<E> deletedNode) {
        if (deletedNode != null) {
            if (deletedNode == first) {
                first = deletedNode.next;
                if (deletedNode.next != null) {
                    deletedNode.next.prev = null;
                }
            } else if (deletedNode == last) {
                last = deletedNode.prev;
                if (deletedNode.prev != null) {
                    deletedNode.prev.next = null;
                }
            } else {
                deletedNode.next.prev = deletedNode.prev;
                deletedNode.prev.next = deletedNode.next;
            }
            size--;
            return deletedNode.value;
        }
        return null;
    }
    @Override
    public boolean remove(E value) {
        Node<E> deletedNode = getNodeByValue(value);
        if (removeNode(deletedNode) != null) {
            return true;
        }
        return false;
    }

    @Override
    public E removeById(int index) {
        Node<E> deletedNode = getNodeByIndex(index);
        return removeNode(deletedNode);
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private static class Node<E> {
        Node<E> prev;
        Node<E> next;
        E value;

        Node() {
        }

        Node(Node<E> prev, E value, Node<E> next) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }

    // Реализовать метод печати для нашего листа
    public void printList() {
        Node<E> currentNode = first;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}
