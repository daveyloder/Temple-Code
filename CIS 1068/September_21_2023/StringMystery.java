package September_21_2023;

public class StringMystery {
    public static void main(String[] args) {
        String word = "Lightning", sentence = "bug in my code", mysteryWord = word
                + sentence.substring(0, 3);
        if (mysteryWord == "lightingbug") {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}
