package September_21_2023;

import java.util.*;

public class RandStuff {
    /* Generate a random number between 1 (inclusive) and max (inclusive) */
    public static int randNum(int max) {
        Random r = new Random();
        return r.nextInt(max) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(randNum(10) + " ");
        }
    }
}
