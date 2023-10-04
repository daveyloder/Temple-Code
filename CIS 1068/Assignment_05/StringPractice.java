package Assignment_05;

import java.util.*;

public class StringPractice {
    /*
     * returns true if c is a punctuation mark or false otherwise
     * 
     * Punctuation mark is defined as:
     * apostrophe '
     * comma ,
     * period .
     * semicolon ;
     * colon :
     * exclamation point !
     * question mark ?
     * 
     * (You don't have to worry about any others)
     */
    public static boolean isPunct(char c) {
        if (c == '\'' || c == '.' || c == ',' || c == ';' || c == '!'
                || c == '?' || c == ':') {
            return true;
        } else {
            return false;
        }
    }

    /*
     * returns the number of punctuation marks
     * found in s.
     *
     * call your isPunct( ) method. Do not compy and paste
     * the same logic into this function
     */
    public static int numPunct(String s) {
        int charcount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isPunct(c)) {
                charcount++;

            }
        }
        return charcount;
    }

    /*
     * returns the number of punctuation marks
     * found in s starting at the given index.
     *
     * call your isPunct( ) method. Do not compy and paste
     * the same logic into this function
     */
    public static int numPunct(String s, int startIndex) {
        int charcount = 0;
        for (int i = startIndex; i < s.length(); i++) {
            if (isPunct(s.charAt(i))) {
                charcount++;

            }
        }
        return charcount;
    }

    /*
     * returns the index of the first punctuation mark in s or
     * -1 if s contains no punctuation marks
     */
    public static int indexOfFirstPunct(String s) {
        int indexNum = -1;
        for (int i = 0; i < s.length(); i++) {
            if (isPunct(s.charAt(i))) {
                indexNum = i;
                break;
            }
        }
        return indexNum;
    }

    /*
     * returns the index of the last occurrence of a punctuation
     * mark in s or -1 if s contains no punctuation
     * 
     * When implementing this function, call your isPunct( ) method.
     * Do not simply copy and paste the body of isPunct( ) into this method.
     */
    public static int indexOfLastPunct(String s) {
        int indexNum = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isPunct(s.charAt(i))) {
                indexNum = i;
                break;
            }

        }
        return indexNum;
    }

    /*
     * returns a new String which is the same as s but with
     * each instance of oldChar replaced with newChar
     */
    public static String substitute(String s, char oldChar, char newChar) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == oldChar) {
                newString = newString + newChar;
            } else {
                newString = newString + String.valueOf(s.charAt(i));
            }
        }
        return newString;
    }

    /*
     * returns a new String which is the same as s, but
     * with each instance of a punctuation mark replaced
     * with a single space character
     *
     * Use at least one of your other functions in your
     * solution to this.
     *
     */
    public static String substitutePunct(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (isPunct(s.charAt(i))) {
                newString = newString + " ";
            } else {
                newString = newString + String.valueOf(s.charAt(i));
            }
        }
        return newString;
    }

    /*
     * returns a new String which is the same as s,
     * but with all of the punctuation
     * marks removed.
     *
     * Use at least one of your other functions
     * in your solution to this one.
     * 
     */
    public static String withoutPunct(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (isPunct(s.charAt(i))) {
                newString = newString + "";
            } else {
                newString = newString + String.valueOf(s.charAt(i));
            }
        }
        return newString;
    }

    /* returns true if c is found in s or false otherwise */
    public static boolean foundIn(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    /*
     * returns the number of times that a punctuation mark
     * immediately follows a character that's not a
     * punctuation mark
     */
    public static int numPunctAfterNonPunct(String s) {
        int numPunctCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!isPunct(s.charAt(i))) {
                if (isPunct(s.charAt(i + 1))) {
                    numPunctCount++;
                }
            }
        }
        return numPunctCount;
    }

    /*
     * Returns true of s is comprised of only punctuation or
     * false otherwise
     *
     * Use at least one of your other
     * functions in this one.
     */
    public static boolean onlyPunct(String s) {
        boolean isFalse = true;
        for (int i = 0; i < s.length(); i++) {
            if (!isPunct(s.charAt(i))) {
                isFalse = false;
            }
        }
        return isFalse;
    }

    /*
     * Returns true of s contains no punctuation or
     * false otherwise
     *
     * Use at least one of your other
     * functions in this one.
     */
    public static boolean noPunct(String s) {
        boolean isFalse = true;
        for (int i = 0; i < s.length(); i++) {
            if (isPunct(s.charAt(i))) {
                isFalse = false;
            }
        }
        return isFalse;
    }

    /*
     * returns true if s has two punctuation marks
     * right next to each other or false otherwise
     *
     * use at least one of your other methods
     * in your solution to this method
     */
    public static boolean consecutivePuncts(String s) {
        boolean isTrue = false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (isPunct(s.charAt(i)) && isPunct(s.charAt(i + 1))) {
                isTrue = true;
            }
        }
        return isTrue;
    }

}
