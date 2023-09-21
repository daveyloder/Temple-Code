package September_21_2023;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    /* Generate a random number between 1 (inclusive) and max (inclusive) */
    public static int randNum(int max) {
        Random r = new Random();
        return r.nextInt(max) + 1;
    }

    public static void main(String[] args) {
        int max = 10;
        int min = 1;

        Scanner in = new Scanner(System.in);

        int mystery = randNum(max);
        System.out.print("I'm thinking of a number between 1 and 10, what number am I guessing? ");
        int guess = in.nextInt();

        if (mystery == guess) {
            System.out.println("You're right!");
        } else if (guess < min) {
            System.out.println("No negative numbers please!");
        } else {
            System.out.print("Nope");
        }

    }
}
