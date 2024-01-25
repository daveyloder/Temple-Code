package HW_1.Exercise2_3;

import java.util.*;

public class Intersect {
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            int num1 = list1.get(i);
            int num2 = list2.get(j);

            if (num1 == num2) {
                result.add(num1);
                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));

        ArrayList<Integer> intersection = intersect(list1, list2);

        System.out.println("Intersection: " + intersection);

    }

}
