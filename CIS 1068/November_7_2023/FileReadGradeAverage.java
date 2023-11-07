package November_7_2023;

import java.io.*;
import java.util.*;

public class FileReadGradeAverage {
    public double highAvg(String filename) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        String line = in.nextLine();
        double highestSoFar = getAvg(line);
        while (in.hasNextLine()) {
            line = in.nextLine();
            double curAvg = getAvg(line);
            if (curAvg > highestSoFar) {
                highestSoFar = curAvg;
            }
        }

        return highestSoFar;
    }

    public double getAvg(String line) {
        int sum = 0;
        int count = 0;
        Scanner in = new Scanner(line);
        String name = in.next();
        while (in.hasNextInt()) {
            sum += in.nextInt();
            count++;
        }
        return sum / (double) count;
    }

    public static void main(String[] args) {

    }
}
