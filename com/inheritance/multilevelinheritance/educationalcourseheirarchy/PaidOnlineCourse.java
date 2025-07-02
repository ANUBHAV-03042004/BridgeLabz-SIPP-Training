package inheritance.multilevelinheritance.educationalcourseheirarchy;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // as percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + getCourseName());
        System.out.println("Duration: " + getDuration() + " weeks");
        System.out.println("Platform: " + getPlatform());
        System.out.println("Recorded: " + (isRecorded() ? "Yes" : "No"));
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: ₹" + getFinalPrice());
    }
}
