package Assignment_10;

public class MultipleChoiceQuestion extends ObjectiveQuestion {
    private String[] possibleAnswers;

    public MultipleChoiceQuestion(int possibleAnswerCapacity) {
        possibleAnswers = new String[possibleAnswerCapacity];
    }

    public String[] getPossibleAnswers() {
        return this.possibleAnswers;
    }

    public void setPossibleAnswer(int index, String newAnswer) {
        if ((index >= 0) && (index <= possibleAnswers.length - 1)) {
            possibleAnswers[index] = newAnswer;
        }

    }

    public String getPossibleAnswerString() {
        String possibleAnswerString = "";
        for (int i = 0; i < possibleAnswers.length; i++) {
            possibleAnswerString += i + 1 + ".) " + possibleAnswers[i] + "\n";
        }
        return possibleAnswerString;
    }

    public String toString() {
        return "Points: " + getPoints() + "\n" + getQuestionText() + "\n" + getPossibleAnswerString();
    }

    public String toStringAnswer() {
        return "Points: " + getPoints() + "\n" + getQuestionText() + "\n"
                + getPossibleAnswerString() + "Answer: " + getCorrectAnswer() + "\n";
    }

}
