package Jan_24_2024.ArrayList_Example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                List.of("one", "two", "three"));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            i++;
            list.add(i, "+");
        }
        System.out.println(list);

    }
}
