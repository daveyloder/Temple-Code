package September_28_2023;

import java.util.*;
import java.io.*;

public class FileTest {
    public static void main(String[] args) throws FileNotFoundException {
        int NUM_LINES = 5;
        File filename = new File(
                "C:\\Users\\David Loder\\Code\\Temple University\\CIS 1068\\September_28_2023\\lyrics.txt");

        Scanner in = new Scanner(filename);
        for (int i = 0; i < NUM_LINES; i++) {
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }

}
