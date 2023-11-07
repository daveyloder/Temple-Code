package November_7_2023;

public class FlashCard {
    String question;
    String answer;

    public FlashCard(String q, String a) {
        question = q;
        answer = a;
    }

    public String toString() {
        return "Question: " + question + "\nAnswer: " + answer;
    }

    public boolean equals(FlashCard o) {
        return (o.question.equals(question)) && (o.answer.equals(answer));
    }
}
