package Jan_24_2024.ArrayList_Example_2;

import java.lang.reflect.Array;
import java.math.*;
import java.util.Arrays;

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

            // Print dorted array
            System.out.println("Draw the following integers " +
                    "from the set 1 to " + (n + k) + ":");

            // Print out results
            System.out.println(Arrays.toString(result));
        }
    }
}
