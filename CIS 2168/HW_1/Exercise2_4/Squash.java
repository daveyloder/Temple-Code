package HW_1.Exercise2_4;

import java.util.*;

public class Squash {
    public static void squash(int[] input) {
        // index to write to and current number set to first element in array
        int index = 1;
        int currNum = input[0];

        // for each item in array,
        // if input array does not match current number,
        // set input element at index ahead and set it to index before
        // set current number to input element at i index
        for (int i = 1; i < input.length; i++) {

            if (input[i] != currNum) {
                input[index++] = input[i];
                currNum = input[i];
            }
        }

        // Fill unused elements at the end with -1
        for (int i = index; i < input.length; i++) {
            input[i] = -1;
        }
    }

    public static void main(String[] args) {
        int[] list = { 0, 0, 0, 0, 1, 1, 0, 0, 0, 7, 7, 7, 1, 1, 0 };
        System.out.println("Before squash: " + Arrays.toString(list));
        squash(list);
        System.out.println("After squash: " + Arrays.toString(list));

    }
}
