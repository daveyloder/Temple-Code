package Feb_14_2024;

import java.util.*;

public class SimplifiedList<E> {
    private int n; // size of the list
    private Node first; // reference to the first list node

    private class Node {
        E data;
        Node next;
    }

    // constructor to initalize Node data type
    public SimplifiedList() {
        first = null;
        n = 0;
    }

    public void addFirst(E value) {
        Node oldfirst = first;
        first = new Node();
        first.data = value;
        first.next = oldfirst;
        n++;
    }

    public void addLast(E value) {
        if (isEmpty())
            addFirst(value);
        else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
                Node last = new Node();
                last.data = value;
                current.next = last;
                n++;
            }
        }
    }

    public E removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("The list is empty");
        E removedValue = first.data;
        first = first.next;
        n--;
        return removedValue;
    }

    public E removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("The list is empty");
        if (n == 1)
            return removeFirst();
        else {
            Node current = first;
            while (current.next.next != null)
                current = current.next;
            E removedValue = current.next.data;
            current.next = null;
            n--;
            return removedValue;
        }
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        if (isEmpty())
            return "This list is empty";
        Node current = first;
        while (current != null) {
            s.append(current.data + " ");
            current = current.next;
        }
        return s.toString();
    }

    public static void main(String[] args) {

    }
}
