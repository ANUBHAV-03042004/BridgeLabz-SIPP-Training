package onlineexamsystem;

import java.util.List;

public class Question<T> {
    private String questionText;
    private String difficulty;
    private List<T> options;
    private T correctAnswer;

    public Question(String questionText, String difficulty, List<T> options, T correctAnswer) {
        this.questionText = questionText;
        this.difficulty = difficulty;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public List<T> getOptions() {
        return options;
    }

    public boolean checkAnswer(T answer) {
        return correctAnswer.equals(answer);
    }
}
