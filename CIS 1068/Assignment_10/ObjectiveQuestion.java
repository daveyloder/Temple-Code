package Assignment_10;

public class ObjectiveQuestion extends Question {
    private String correctAnswer;

    public ObjectiveQuestion() {
        correctAnswer = "";
    }

    // correctAnswer getter/setter
    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(String ca) {
        this.correctAnswer = ca;
    }

    public String toString() {
        return "Points: " + getPoints() + "\n" + getQuestionText() + "\n";
    }

    public String toStringAnswer() {
        return "Points: " + getPoints() + "\n" + getQuestionText() + "\n" + "Answer: " + getCorrectAnswer()
                + "\n";
    }

}
