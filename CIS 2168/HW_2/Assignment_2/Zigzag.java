package HW_2.Assignment_2;

import java.util.*;

public class Zigzag {
    public static List<Integer> zigzag(List<List<Integer>> array) {
        int height = array.size() - 1;
        int width = array.get(0).size() - 1;
        List<Integer> result = new ArrayList<>();

        int row = 0, col = 0;
        // Code here and below:
        boolean goingDown = true;
        while (!outOfBounds(row, col, height, width)) {
            result.add(array.get(row).get(col));
            // If going down
            if (goingDown) {
                // Checks if col is at 0 or if row is at an edge, changes direction
                if (col == 0 || row == height) {
                    goingDown = false;
                    // if the row is at an edge, increase col, otherwise increase row
                    if (row == height) {
                        col++;
                    } else {
                        row++;
                    }
                    // if not go down and to the left
                } else {
                    row++;
                    col--;
                }
                // if row is at 0 and col is at an edge change direction
            } else {
                if (row == 0 || col == width) {
                    goingDown = true;
                    if (col == width) {
                        row++;
                    } else {
                        col++;
                    }
                } else {
                    row--;
                    col++;
                }
            }

        }
        return result;
    }

    public static boolean outOfBounds(int row, int col, int height, int width) {
        return row < 0 || row > height || col < 0 || col > width;
    }

    public static void main(String[] args) {

        List<List<Integer>> table;
        List<Integer> result;

        List<Integer> row1, row2, row3, row4, row5, row6; // in test cases, these will be table rows

        /*------------- START TEST 1 ---------------*/
        row1 = new ArrayList<>(List.of(1, 3, 4, 7));
        row2 = new ArrayList<>(List.of(2, 5, 6, 8));
        table = new ArrayList<>(List.of(row1, row2));
        result = zigzag(table);
        System.out.println("Test 1 result: \n\t " + result + "\n"); // [ 1, 2, 3, 4, 5, 6, 7, 8 ]

        /*------------- START TEST 2 ---------------*/
        row1 = new ArrayList<>(List.of(1, 3, 4, 10));
        row2 = new ArrayList<>(List.of(2, 5, 9, 11));
        row3 = new ArrayList<>(List.of(6, 8, 12, 15));
        row4 = new ArrayList<>(List.of(7, 13, 14, 16));
        table = new ArrayList<>(List.of(row1, row2, row3, row4));
        result = zigzag(table);
        System.out.println("Test 2 result: \n\t " + result + "\n"); // should print [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                                                                    // 12, 13, 14, 15, 16]

        /*------------- START TEST 3 ---------------*/
        row1 = new ArrayList<>(List.of(1)); // [1]
        table = new ArrayList<>(List.of(row1));
        result = zigzag(table);
        System.out.println("Test 3 result: \n\t " + result + "\n"); // should print [1]

        /*------------- START TEST 4 ---------------*/
        row1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        table = new ArrayList<>(List.of(row1));
        result = zigzag(table);
        System.out.println("Test 4 result: \n\t " + result + "\n"); // should print [1, 2, 3, 4, 5, 6, 7]

        /*------------- START TEST 5 ---------------*/
        row1 = new ArrayList<>(List.of(1));
        row2 = new ArrayList<>(List.of(2));
        row3 = new ArrayList<>(List.of(3));
        row4 = new ArrayList<>(List.of(4));
        table = new ArrayList<>(List.of(row1, row2, row3, row4));
        result = zigzag(table);
        System.out.println("Test 5 result: \n\t " + result + "\n"); // should print [1, 2, 3, 4]
        //
        // /*------------- START TEST 6 ---------------*/
        row1 = new ArrayList<>(List.of(1, 3));
        row2 = new ArrayList<>(List.of(2, 4));
        row3 = new ArrayList<>(List.of(5, 7));
        row4 = new ArrayList<>(List.of(6, 8));
        row5 = new ArrayList<>(List.of(9, 10));
        table = new ArrayList<>(List.of(row1, row2, row3, row4, row5));
        result = zigzag(table);
        System.out.println("Test 6 result: \n\t " + result + "\n"); // should print
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //
        // /*------------- START TEST 7 ---------------*/
        row1 = new ArrayList<>(List.of(1, 21, -3, 4, 15, 6, -7, 88, 9));
        row2 = new ArrayList<>(List.of(10, 11, 112, 12, 20, -1, -2, -3, -4));
        row3 = new ArrayList<>(List.of(6, 8, 113, 19, 21, 0, 0, 0, 0));
        row4 = new ArrayList<>(List.of(7, 2, 18, 22, -27, 12, 32, -11, 66));
        row5 = new ArrayList<>(List.of(15, 17, 23, 226, 28, -28, -226, -23, -17));
        row6 = new ArrayList<>(List.of(16, 24, 27, 299, 30, 29, 32, 31, 88));
        table = new ArrayList<>(List.of(row1, row2, row3, row4, row5, row6));
        result = zigzag(table);
        System.out.println("Test 7 result: \n\t " + result + "\n"); // should print
        // [1, 10, 21, -3, 11, 6, 7, 8, 112, 4,
        // // 15, 12, 113, 2, 15, 16, 17, 18, 19,
        // // 20, 6, -7, -1, 21, 22, 23, 24, 27,
        // // 226, -27, 0, -2, 88, 9, -3, 0, 12,
        // // 28, 299, 30, -28, 32, 0, -4, 0, -11,
        // // -226, 29, 32, -23, 66, -17, 31, 88]

    }

}
