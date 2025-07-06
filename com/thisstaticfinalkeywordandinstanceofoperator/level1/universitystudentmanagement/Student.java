package thisstaticfinalkeywordandinstanceofoperator.level1.universitystudentmanagement;

public class Student {
    // Static variable shared by all students
    private static String universityName = "ABC University";
    private static int totalStudents = 0;

    // Final variable to ensure rollNumber is immutable
    private final int rollNumber;

    // Instance variables
    private String name;
    private String grade;

    // Constructor using 'this' keyword for clarity
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;  // Increment count whenever a student is created
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Static method to update university name
    public static void updateUniversityName(String newUniversity) {
        universityName = newUniversity;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    // Static method to safely check object type before accessing
    public static void processStudent(Object obj) {
        if (obj instanceof Student) {
            System.out.println("Valid Student Record:");
            ((Student) obj).displayStudentDetails();
        } else {
            System.out.println("Invalid object. Not a Student.");
        }
    }
}

