package onlinequiztimer;

class QuizTimer {
    private int[] slots;
    private int currentIndex;

    public QuizTimer(int numQuestions, int timePerQ) {
        slots = new int[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            slots[i] = timePerQ; // assign equal time to each question
        }
        currentIndex = 0;
    }

    // Move to next question in circular fashion
    public void nextQuestion() {
        currentIndex = (currentIndex + 1) % slots.length;
    }

    public void showWarning() {
        if (slots[currentIndex] <= 5) { // warning if less than 5s left
            System.out.println("⚠️ Warning! Time running out for Question " + (currentIndex + 1));
        }
    }

    public void tick() {
        if (slots[currentIndex] > 0) {
            slots[currentIndex]--;
        }
        showWarning();
    }
}
