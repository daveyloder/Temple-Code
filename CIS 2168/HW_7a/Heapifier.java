package HW_7a;

import java.util.*;

public class Heapifier {
    private Heapifier() {
    }

    public static void heapify(Comparable[] a) {
        int n = a.length;
        for (int k = n / 2; k >= 1; k--) {
            sink(a, k, n);
        }
    }

    private static void sink(Comparable[] a, int k, int n) {
        // Keep running until k * 2 is greater than n
        while (2 * k <= n) {
            // set variable j to equal 2*k
            int j = 2 * k;
            if (j < n && less(a, j, j + 1)) {
                j++;
            }
            if (!less(a, k, j)) {
                break;
            }
            exch(a, k, j);
            k = j;
        }
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i - 1].compareTo(a[j - 1]) < 0;
    }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i - 1];
        a[i - 1] = a[j - 1];
        a[j - 1] = swap;
    }

    public static void main(String[] args) {
        Character[] letters = { 'P', 'L', 'A', 'Y', 'G', 'R', 'O', 'N', 'D' };
        Character[] letters2 = { 'M', 'I', 'S', 'C', 'O', 'U', 'N', 'T', 'E', 'D' };
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(letters2));

        Heapifier.heapify(letters);
        System.out.println(Arrays.toString(letters));
        Heapifier.heapify(letters2);
        System.out.println(Arrays.toString(letters2));
    }

}