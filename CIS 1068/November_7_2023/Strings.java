package November_7_2023;

import java.util.*;

public class Strings {

    public String acronym(String line) {
        String a = "";
        Scanner in = new Scanner(line);
        while (in.hasNext()) {
            String word = in.next();
            a += word.charAt(0);
        }
        return a;
    }
}
