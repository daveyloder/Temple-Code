package Feb_21_2024;

import java.util.*;

public class Stack<E> implements Iterable<E> {
    private Node<E> first;
    private int n;

    private static class Node<E> {
        private E data;
        private Node next;
    }

    public void push(E item) {
        Node oldfirst = first;
        first = new Node();
        first.data = item;
        first.next = oldfirst;
    }

    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("The stack is empty.");
        }
        E removedValue = first.data;
        first = first.next;
        n--;
        return removedValue;
    }

    public E peek() {
        if (isEmpty())
            throw new NoSuchElementException("Stack underflow");
        return first.data;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public Iterator<E> iterator() {
        return new StackIterator(first);
    }

    private class StackIterator implements Iterator<E> {
        private Node current;

        public StackIterator(Node<E> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E item = (E) current.data;
            current = current.next;
            return item;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        if (isEmpty()) {
            return "This stack is empty";
        }
        for (E element : this) {
            s.append(element + " ");
        }
        return s.toString();
    }
}
