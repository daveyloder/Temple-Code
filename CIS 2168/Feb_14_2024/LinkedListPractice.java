package Feb_14_2024;

public class LinkedListPractice {
    Node first;
    int size;

    class Node {
        private Object data;
        private Node next;
    }

    void add(Object item) {
        Node oldfirst = first;
        first = new Node();
        first.data = item;
        first.next = oldfirst;
        size++;
    }

    // part a & b
    public void printMiddle() {
        // Node that moves through the links slow and fast
        Node slow = first;
        Node fast = first;
        // if first is not null run the while loop until fast and slow are null. fast
        // will be two links ahead while slow will be one link. When fast ends, slow
        // should be close to the middle of the linkedlist.
        if (first != null) {
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            // Print out result
            System.out.println("The middle element is " + slow.data);
        }
    }

    // part c & d
    public void reverseList() {
        Node previous = null;
        Node current = first;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        first = previous;
        for (Node x = first; x != null; x = x.next) {
            System.out.print(x.data);
        }
    }

    public static void main(String[] args) {
        // Create the linkedlist
        LinkedListPractice list = new LinkedListPractice();
        list.add(8);
        list.add(6);
        list.add(1);
        list.add(2);
        // Print created linked list
        for (Node x = list.first; x != null; x = x.next) {
            System.out.print(x.data);
        }
        System.out.println();

        list.printMiddle();
        list.reverseList();
    }
}
