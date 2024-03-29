import java.io.*;
import java.util.*;

public class UniqueWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Mar_22_2024\\mobydick.txt"));
        Set<String> words = new TreeSet<>();

        while (in.hasNext()) {
            String word = in.next();
            word = word.toLowerCase();

            // Checks if word starts with "a" and the word's length is 3 characters
            if (word.startsWith("a") && word.length() == 3) {
                words.add(word);
            }
            // words.add(word);
            // System.out.println(in.next());
        }
        // Prints the set with punctuation
        System.out.println("Three-Letter Words that start with 'a'");
        System.out.println(words);
        System.out.println();
        // How many unique elements in the set
        System.out.println("There are " + words.size() + " elements in the set.");
    }
}
