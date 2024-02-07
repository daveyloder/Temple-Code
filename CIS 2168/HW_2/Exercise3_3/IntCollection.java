package HW_2.Exercise3_3;

import java.util.*;

public class IntCollection {
    private int[] a;

    public IntCollection(int[] keys) {
        a = Arrays.copyOf(keys, keys.length); // defensive copy
        Arrays.sort(a);
    }

    public boolean contains(int key) {
        return indexOf(key) != -1;
    }

    private int indexOf(int key) {
        // indexOf() implemented as a binary search.
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (key > a[mid]) {
                i = mid + 1;
            } else if (key < a[mid]) {
                j = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

}
