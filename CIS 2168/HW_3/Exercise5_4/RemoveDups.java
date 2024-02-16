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

    public static LinkedList deDup(LinkedList first) {
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

    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.next = new LinkedList(2);
        list.next.next = new LinkedList(2);
        list.next.next.next = new LinkedList(3);
        // System.out.println("Before remove duplicates");
        // while (list != null) {
        // System.out.print(list.value + " ->");
        // list = list.next;
        // }

        // deDup the list
        deDup(list);
        System.out.println("After remove duplicate");
        while (list != null) {
            System.out.print(list.value + " ->");
            list = list.next;
        }

    }
}
