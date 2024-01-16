package Assignment_10;

public class Test {
    private ObjectiveQuestion[] questions;
    private int totalPoints = 0;

    public Test(int totalTestQuestions) {
        questions = new ObjectiveQuestion[totalTestQuestions];
    }

    public String getTestQuestion(int questNum) {
        String questionText = "";
        if ((questNum >= 0) && (questNum <= questions.length)) {
            questionText = "Question " + (questNum + 1) + "\n" + questions[questNum].toString() + "\n";
        }
        return questionText;
    }

    public void setTestQuestion(int questNum, ObjectiveQuestion newQuestion) {
        if ((questNum >= 0) && (questNum <= questions.length)) {
            questions[questNum] = newQuestion;
        }
    }

    public int sumQuestionPoints() {
        int sumTotalPoints = 0;
        for (int i = 0; i < questions.length; i++) {
            sumTotalPoints += questions[i].getPoints();
        }
        return totalPoints = sumTotalPoints;
    }

    public String toString() {
        String testQuestionsString = "\nTest\n\n Total points possible: " + sumQuestionPoints() + "\n\n";
        for (int i = 0; i < questions.length; i++) {
            testQuestionsString += "Question " + (i + 1) + "\n" + questions[i].toString() + "\n\n";
        }
        return testQuestionsString;
    }

    public String toStringAnswerKey() {
        String testAnswerKeyString = "\n***** Test Answer Key *****\n\n Total points possible: " + sumQuestionPoints()
                + "\n\n";
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getCorrectAnswer() == "") {
                questions[i].setCorrectAnswer("No answer listed");
            }
            testAnswerKeyString += "Question " + (i + 1) + "\n" + questions[i].toStringAnswer() + "\n\n";
        }
        return testAnswerKeyString;
    }

}
