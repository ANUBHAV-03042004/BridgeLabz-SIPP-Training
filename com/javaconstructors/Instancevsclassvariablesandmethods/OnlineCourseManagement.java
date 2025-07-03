package javaconstructors.Instancevsclassvariablesandmethods;

public class OnlineCourseManagement {
	    // Instance variables
	    private String courseName;
	    private int duration; // in weeks
	    private double fee;

	    // Class variable: common to all courses
	    private static String instituteName = "SkillUp Academy";

	    // Constructor
	    public OnlineCourseManagement(String courseName, int duration, double fee) {
	        this.courseName = courseName;
	        this.duration = duration;
	        this.fee = fee;
	    }

	    // Instance method to display course details
	    public void displayCourseDetails() {
	        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: ₹" + fee);
	        System.out.println("Institute: " + instituteName);
	    }

	    // Class method to update institute name
	    public static void updateInstituteName(String newName) {
	        instituteName = newName;
	    }

	    public static void main(String[] args) {
	        OnlineCourseManagement c1 = new OnlineCourseManagement("Java Programming", 8, 5000);
	        OnlineCourseManagement c2 = new OnlineCourseManagement("Web Development", 10, 6000);
	        OnlineCourseManagement.updateInstituteName("Universal Academy");
	        c1.displayCourseDetails();
	        c2.displayCourseDetails();

	        System.out.println("\nUpdating Institute Name...\n");
	        OnlineCourseManagement.updateInstituteName("TechBridge Academy");

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();
	    }
	}

