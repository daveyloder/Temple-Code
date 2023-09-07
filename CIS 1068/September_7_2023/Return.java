package September_7_2023;

public class Return {
    // Returns the slope of the line between two given points.
    public static double slope(int x1, int y1, int x2, int y2) {
        double dy = y2 - y1;
        double dx = x2 - x1;
        double result = dy / dx;
        return result;
    }

    // Needs to run main last so it can read all other methods an return those
    // values.
    public static void main(String[] args) {
        double result = slope(0, 0, 6, 3);
        System.out.println("The slope is: " + result);
    }

}
