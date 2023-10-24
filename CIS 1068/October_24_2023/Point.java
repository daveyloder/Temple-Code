package October_24_2023;

public class Point {
    private int x;
    private int y;

    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void move(Point o) {
        x += o.x;
        y += o.y;
    }

    // accessor method
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
