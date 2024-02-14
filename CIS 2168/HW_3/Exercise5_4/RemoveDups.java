package HW_3.Exercise5_4;

public class RemoveDups {
    // Input class
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList deDup(LinkedList first) {
        // code here, shouldn't be more than 7 lines
        while (first != null && first.next != null) {
            if (first.value == first.next.value) {
                first.next = first.next.next; // Skip the duplicate number
            } else {
                first = first.next; // Move to the next non-duplicate number
            }
        }
        return first;
    }

}
