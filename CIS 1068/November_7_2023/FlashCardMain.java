package November_7_2023;

public class FlashCardMain {
    public static void main(String[] args) {
        FlashCard q1 = new FlashCard("What is the most important meal of the day?", "Lunch");
        FlashCard q2 = new FlashCard("Who is the King of Five Night's at Freddy's", "Markiplier");
        FlashCard q3 = new FlashCard("Who is the King of Five Night's at Freddy's", "Markiplier");

        System.out.println(q1);
        System.out.println(q2);

        System.out.println(q1.equals(q3));
        System.out.println(q2.equals(q3));

    }
}
