package inheritance.multilevelinheritance.educationalcourseheirarchy;

public class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Getters
    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }
}
