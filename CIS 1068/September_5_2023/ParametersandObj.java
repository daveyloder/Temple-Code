package September_5_2023;

public class ParametersandObj {
    // method to create a line
    public static void line(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // method to create a box
    public static void box(int l, int w) {
        // Creates the top of the box
        line(w);
        // Sets the row of the box
        for (int i = 1; i <= l; i++) {
            /*
             * Sets the column of to print or not to print "*"
             * based on position
             */
            for (int j = 1; j <= w; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else if (j == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Creates the bottom of the box
        line(w);
    }

    public static void main(String[] args) {
        box(5, 10);
    }
}
