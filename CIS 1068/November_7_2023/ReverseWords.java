package November_7_2023;

public class ReverseWords {
    public void revAll(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = reverse(words[i]);
        }
    }

    public String reverse(String word) {
        String r = "";

        for (int i = word.length(); i >= 0; i--) {
            r += word.charAt(i);
        }
        return r;
    }
}
