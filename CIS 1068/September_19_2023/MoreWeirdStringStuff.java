package September_19_2023;

import java.util.*;

public class MoreWeirdStringStuff {
    /*
     * public static boolean sameBROKEN(String s1, String s2) {
     * return s1 == s2;
     * };
     */

    public static boolean same(String s1, String s2) {
        /*
         * check the lengths. if the lengths
         * are different, the strings must be different
         */
        if (s1.length() != s2.length()) {
            return false;
        }

        /*
         * compare the two strings letter by letter
         * if we find a pair that are not the same
         * return false
         */
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean sameIgnoringCase(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        return same(s1, s2);
        // if (s1.length() != s2.length()) {
        // return false;
        // }

        /*
         * compare the two strings letter by letter
         * if we find a pair that are not the same
         * return false
         */
        // for (int i = 0; i < s1.length(); i++) {
        // if (s1.charAt(i) != s2.charAt(i)) {
        // return false;
        // }
        // }

        // return true;
    }

    public static void main(String[] args) {
        boolean DEBUG = false;
        String name;
        Scanner inFromKBD = new Scanner(System.in);
        System.out.println("What's your name? ");

        name = inFromKBD.nextLine();
        if (DEBUG) {
            System.out.println("name =" + name.getClass());
        }
        // Won't work as it compares the value where it is stored in memory
        // if (name.toLowerCase() == "spongebob") {
        // System.out.println("Where's Partrick?");
        // } else {
        // System.out.println("Hi " + name + ", pleased to meet you!");
        // }

        // Or if (name.equalsIgnoreCase("spongebob") {
        if (sameIgnoringCase("spongebob", name)) {
            System.out.println("Where's Partrick?");
        } else {
            System.out.println("Hi " + name + ", pleased to meet you!");
        }
    }
}
