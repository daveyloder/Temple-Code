package HW_1.Question_2_5;

import java.util.*;

public class InsertPlusSolution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                List.of("one", "two", "three", "four"));
        System.out.println("list = " + list);

        // insert a + in front of every list element
        for (int i = 0; i < list.size(); i++) {
            list.add(i, "+");
            i++;
            System.out.println("updated list = " + list);
        }
    }
}
