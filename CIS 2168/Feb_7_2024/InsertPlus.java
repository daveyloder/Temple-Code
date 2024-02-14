package Feb_7_2024;

import java.util.ArrayList;

public class InsertPlus {
    public static void main(String[] args) {
        ResizingArrayList<String> list = new ResizingArrayList<>();
        // ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);
        for (int i = 1; i < list.size(); i += 2) {
            list.add(i, "+");
        }
        System.out.println(list);
    }
}
