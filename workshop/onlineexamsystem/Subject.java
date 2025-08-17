package onlineexamsystem;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
    private String name;
    private List<Question<T>> questions;

    public Subject(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Question<T>> getQuestions() {
        return questions;
    }

    public void addQuestion(Question<T> question) {
        questions.add(question);
    }
}
