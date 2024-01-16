package Assignment_10;

public class Driver {
    public static void main(String[] args) {
        final ObjectiveQuestion q1 = new ObjectiveQuestion();
        q1.setPoints(10);
        q1.setDifficulty(5);
        q1.setQuestionText("What is a fish?");
        q1.setCorrectAnswer("It's a fish");

        final ObjectiveQuestion q2 = new ObjectiveQuestion();
        q2.setPoints(10);
        q2.setDifficulty(8);
        q2.setQuestionText("What is 2+2 equal?");
        q2.setCorrectAnswer("4");

        final MultipleChoiceQuestion q3 = new MultipleChoiceQuestion(4);
        q3.setPoints(10);
        q3.setDifficulty(2);
        q3.setQuestionText("What did I say learning Calculus?");
        q3.setCorrectAnswer("4");
        q3.setPossibleAnswer(0, "Damn");
        q3.setPossibleAnswer(1, "Crap");
        q3.setPossibleAnswer(2, "Damn again");
        q3.setPossibleAnswer(3, "Dammit");

        final FillInTheBlankQuestion q4 = new FillInTheBlankQuestion();
        q4.setPoints(20);
        q4.setDifficulty(7);
        q4.setQuestionText("Who was the 16th US President?");
        q4.setCorrectAnswer("Abraham Lincoln");

        Test test = new Test(4);
        test.setTestQuestion(0, q1);
        test.setTestQuestion(1, q2);
        test.setTestQuestion(2, q3);
        test.setTestQuestion(3, q4);

        System.out.println(test.toString());
        System.out.println(test.toStringAnswerKey());
    }
}
