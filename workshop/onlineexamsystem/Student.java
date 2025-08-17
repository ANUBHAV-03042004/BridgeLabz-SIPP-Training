package onlineexamsystem;

import java.util.*;

public class Student {
    private String name;
    private String rollNumber;
    private Map<String, List<Object>> submittedAnswers;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.submittedAnswers = new HashMap<>();
    }

    public void submitAnswer(String subject, Object answer) {
        submittedAnswers.computeIfAbsent(subject, k -> new ArrayList<>()).add(answer);
    }
}
