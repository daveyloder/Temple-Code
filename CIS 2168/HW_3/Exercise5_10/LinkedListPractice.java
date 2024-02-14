package HW_3.Exercise5_10;

public class LinkedListPractice {
    Node first;

    class Node {
        Object data;
        Node next;
    }

    void add(Object item) {
        Node oldfirst = first;
        first = new Node();
        first.data = item;
        first.next = oldfirst;
    }

    public void printMiddle() {
        // Node that loves through the links slow and fast
        Node slow = first;
        Node fast = first;
        // if first is not null run the while loop until fast and slow are null. fast
        // will be two links ahead while slow will be one link. When fast ends, slow
        // should be close to the middle of the linkedlist.
        if (first != null) {
            while (fast != null && slow != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            // Print out result
            System.out.println("The middle element is " + slow.data);
        }
    }

    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
        list.add(8);
        list.add(6);
        list.add(1);
        list.add(2);

        for (Node x = list.first; x != null; x = x.next) {
            System.out.print(x.data);
        }
        System.out.println(list);

        list.printMiddle();
    }
}
