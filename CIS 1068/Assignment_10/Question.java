package Assignment_10;

public class Question {
    private double points;
    private int difficulty;
    private int MIN_DIFFICULTY = 1;
    private int MAX_DIFFICULTY = 10;
    private int answerSpace = 14;
    private String questionText;

    public Question() {
        points = 0.0;
        difficulty = 1;
        questionText = "";

    }

    // points getter/setter
    public double getPoints() {
        return this.points;
    }

    public void setPoints(double p) {
        this.points = p;
    }

    // difficulty getter/setter
    public int getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(int d) {
        if (d < 0) {
            this.difficulty = MIN_DIFFICULTY;
        } else if (d > 0) {
            this.difficulty = MAX_DIFFICULTY;
        } else {
            this.difficulty = d;
        }
    }

    // answerSpace getter/setter
    public int getAnswerSpace() {
        return this.answerSpace;
    }

    // questionText getter/setter
    public String getQuestionText() {
        return this.questionText;
    }

    public void setQuestionText(String qt) {
        this.questionText = qt;
    }

    // toString Method
    public String toString() {
        return questionText;
    }

}
