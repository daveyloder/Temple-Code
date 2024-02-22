package HW_4;

import java.util.NoSuchElementException;
import java.util.concurrent.RecursiveTask;

public class SLL2<E> {
    private int n; // sixe of the list
    private Node first; // first node reference

    private class Node {
        E data;
        Node next;

    }

    public SLL2() {
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
        if (isEmpty()) {
            addFirst(value);
        }

        else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            Node last = new Node();
            last.data = value;
            current.next = last;
            n++;
        }
    }

    // removes and returns the first element from the list
    public E removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("The list is empty!");

        E removedValue = first.data;
        first = first.next;
        n--;

        return removedValue; // CHANGE THIS LINE
    }

    // removes and returns the last element from the list
    public E removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("The list is empty");

        if (n == 1) // if only one node in the list
            return removeFirst();

        else { // else have at least two nodes
            Node current = first;

            while (current.next.next != null) // next to last node
                current = current.next;
            E removedValue = current.next.data;
            current.next = null;
            n--;
            return removedValue;
        }
    }

    // is this list empty?
    public boolean isEmpty() {

        return n == 0;
    }

    // the size of this list (the number of nodes in it)
    public int size() {
        return n;
    }

    // returns a string representation of this list
    public String toString() {
        StringBuilder s = new StringBuilder();
        if (isEmpty())
            return "This list is empty ";
        Node current = first;
        while (current != null) {
            s.append(current.data + " ");
            current = current.next;
        }
        return s.toString();
    }

}
