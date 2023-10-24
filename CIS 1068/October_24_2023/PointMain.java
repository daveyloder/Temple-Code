package October_24_2023;

import October_24_2023.Point;

public class PointMain {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println("Before: " + p);

        p.move(5, 5);

        Point p2 = new Point(5, 5);
        p2.move(1, 1);

        p.move(p2);

        System.out.println("After: " + p);

    }
}
