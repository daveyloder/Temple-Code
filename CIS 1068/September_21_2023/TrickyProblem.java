package September_21_2023;

import java.util.*;

public class TrickyProblem {
    // Write a program to read a set of exam scores
    public static void main(String[] args) {
        Scanner examScoreInput = new Scanner(System.in);
        boolean continueLoop = true;
        int examcount = 0;
        int scorecount = 0;

        if (scorecount < 0) {
            System.out.println("No scores entered");
            continueLoop = false;
        } else {
            while (continueLoop) {

            }
            int averageScore = scorecount / examcount;
            System.out.println("Average score: " + averageScore);
        }

        // The program then prints the average score (or 'no scores entered')
        // If no scores have been entered
    }
}
