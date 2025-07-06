package thisstaticfinalkeywordandinstanceofoperator.level1.universitystudentmanagement;

public class Main {
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student(101, "Alice", "A");
        Student s2 = new Student(102, "Bob", "B");
        Student s3 = new Student(103, "Charlie", "A+");

        // Displaying individual student details
        System.out.println("--- Student 1 ---");
        Student.processStudent(s1);

        System.out.println("\n--- Student 2 ---");
        Student.processStudent(s2);

        System.out.println("\n--- Student 3 ---");
        Student.processStudent(s3);

        // Showing total enrolled students
        System.out.println("\n--- University Summary ---");
        Student.displayTotalStudents();

        // Updating university name
        System.out.println("\n--- Updating University Name to 'XYZ University' ---");
        Student.updateUniversityName("XYZ University");

        // Verifying update
        System.out.println("\n--- Updated Student Details ---");
        Student.processStudent(s1);
    }
}
