package HW_4;

import HW_4.SLL2;

public class Leader {

    public static void main(String[] args) {
        int n = 7; // n = 1000000;
        int m = 3; // m = 10;

        // place the candidates in a list
        SLL2<Integer> circle = new SLL2<>();
        for (int i = 1; i <= n; i++) {
            circle.addLast(i);
        }

        System.out.println(circle);

        while (circle.size() != 1) {
            for (int i = 1; i < m + 1; i++) {
                circle.addLast(circle.removeFirst());
            }
            circle.removeLast();
            System.out.println(circle);
        }

        System.out.println("\nleader: " + circle);
    }
}
