package Jan_26_2024.ClassExercise;

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
            int mid = Math.floorDiv((i + j), 2);
            if (key > a[mid]) {
                i = mid + 1;
            } else if (key < a[mid]) {
                j = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
        // indexOf() implemented as a linear search.
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] == key) {
        // return i;
        // }
        // }
        // return -1;

    }

}
