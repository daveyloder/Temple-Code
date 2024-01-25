package HW_1.Exercise2_2;

import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        {
            int n = 49;
            int k = 6;
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;
            }
            int[] result = new int[k];

            // draw k numbers from the first array and put them into second array
            for (int i = 0; i < result.length; i++) {
                // make a random selection between 0 and n-1
                int r = (int) (Math.random() * n);
                // Pick the element at the random index
                result[i] = numbers[r];
                // move the last element (of the array) into the random location
                numbers[r] = n - 1;
                n--;
            }
            // sorts the array from lowest to highest
            Arrays.sort(result);

            // Print dorted array
            System.out.println("Draw the following integers " +
                    "from the set 1 to " + (n + k) + ":");

            // Print out results
            System.out.println(Arrays.toString(result));
        }
    }
}
