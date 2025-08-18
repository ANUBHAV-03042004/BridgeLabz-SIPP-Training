package onlinequiztimer;

public class OnlineQuizTimer {
    public static void main(String[] args) {
        QuizTimer qt = new QuizTimer(3, 10); // 3 questions, 10 sec each
        for (int i = 0; i < 15; i++) {
            qt.tick();
            if (i % 5 == 0) qt.nextQuestion();
        }
    }
}
