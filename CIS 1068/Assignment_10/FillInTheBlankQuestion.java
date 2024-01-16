package Assignment_10;

public class FillInTheBlankQuestion extends ObjectiveQuestion {

    public String setAnswerLines() {
        String answerLines = "";
        for (int i = 0; i < getAnswerSpace(); i++) {
            answerLines += "_";
        }
        return answerLines;
    }

    public String setAnswerLinesWithAnswer() {
        String answerLines = "";
        answerLines += "_";
        for (int i = 0; i < getCorrectAnswer().length(); i++) {
            answerLines = answerLines + getCorrectAnswer().charAt(i);
        }
        answerLines += "_";

        return answerLines;

    }

    public String toString() {
        return "Points: " + getPoints() + "\n" + getQuestionText() + " " + setAnswerLines() + "\n";
    }

    public String toStringAnswer() {
        return "Points: " + getPoints() + "\n" + getQuestionText() + " " + setAnswerLinesWithAnswer() + "\n";
    }
}
