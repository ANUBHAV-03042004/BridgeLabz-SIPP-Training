package onlineexamsystem;

import java.util.*;

public class ExamSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Subject Java with MCQs (String answers)
        Subject<String> java = new Subject<>("Java");
        java.addQuestion(new Question<>(
                "What is JVM?", "EASY",
                Arrays.asList("A. Compiler", "B. Interpreter", "C. Virtual Machine", "D. OS"),
                "C"
        ));
        java.addQuestion(new Question<>(
                "Which keyword is used for inheritance?", "EASY",
                Arrays.asList("A. implement", "B. extends", "C. inherit", "D. super"),
                "B"
        ));

        // Subject DBMS with numeric answers
        Subject<Integer> dbms = new Subject<>("DBMS");
        dbms.addQuestion(new Question<>(
                "How many normal forms are there in DBMS?", "EASY",
                Arrays.asList(1, 2, 3, 4), 3
        ));

        // Student
        Student s1 = new Student("Anubhav", "101");

        System.out.println("Choose subject: 1. Java 2. DBMS");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            takeExam(sc, java, s1);
        } else if (choice == 2) {
            takeExam(sc, dbms, s1);
        }

        sc.close();
    }

    // Generic exam method
    private static <T> void takeExam(Scanner sc, Subject<T> subject, Student student) {
        System.out.println("Starting exam for subject: " + subject.getName());
        int score = 0;

        for (Question<T> q : subject.getQuestions()) {
            System.out.println(q.getQuestionText());
            for (T option : q.getOptions()) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            T answer;

            // Handle input type based on T
            if (q.getOptions().get(0) instanceof String) {
                answer = (T) sc.nextLine().trim().toUpperCase();
            } else {
                answer = (T) (Integer) sc.nextInt();
                sc.nextLine(); // consume newline
            }

            student.submitAnswer(subject.getName(), answer);

            if (q.checkAnswer(answer)) {
                score++;
            }
        }

        System.out.println("Exam finished. Score: " + score + "/" + subject.getQuestions().size());
    }
}
