package HW_4;

import HW_4.SLL2;

public class Leader {

    public static void main(String[] args) {
        int n = 7; // n = 1000000;
        int m = 4; // m = 10;

        // place the candidates in a list
        SLL2<Integer> circle = new SLL2<>();
        for (int i = 1; i <= n; i++) {
            circle.addLast(i);
        }
        // print out what the circle has to start
        System.out.println(circle);
        // runs while the circle simple list is not equal to one
        while (circle.size() != 1) {
            // for each node in the simple list, take the first node and add it to the end
            // of the list
            for (int i = 1; i < m + 1; i++) {
                circle.addLast(circle.removeFirst());
            }
            // remove the node at the end of the list
            circle.removeLast();
            // print result to see result.
            System.out.println(circle);
        }
        // Final print out with elected leader in circle.
        System.out.println("\nleader: " + circle);
    }
}
