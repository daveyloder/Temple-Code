package HW_2.Exercise3_2;

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
        // indexOf() implemented as a linear search.
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;

    }

}
