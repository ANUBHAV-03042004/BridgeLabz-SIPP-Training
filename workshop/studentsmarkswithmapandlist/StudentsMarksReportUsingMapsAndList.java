package studentsmarkswithmapandlist;
import java.util.*;
public class StudentsMarksReportUsingMapsAndList {
    // Map to store student name as key and List of marks as value
    private Map<String, List<Integer>> studentMarks = new HashMap<>();

    // Method to add a new mark for a student
    public void addMark(String studentName, int mark) {
        // If student already exists, add to existing list; otherwise, create a new list
        studentMarks.computeIfAbsent(studentName, k -> new ArrayList<>()).add(mark);
    }

    // Method to calculate average marks of a student
    public double calculateAverage(String studentName) {
        List<Integer> marks = studentMarks.get(studentName);
        if (marks == null || marks.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / marks.size();
    }

    // Method to get the top-performing student
    public String getTopStudent() {
        String topStudent = null;
        double highestAverage = 0.0;

        for (String student : studentMarks.keySet()) {
            double avg = calculateAverage(student);
            if (avg > highestAverage) {
                highestAverage = avg;
                topStudent = student;
            }
        }
        return topStudent + " (Avg: " + highestAverage + ")";
    }

    // Main method for testing
    public static void main(String[] args) {
    	StudentsMarksReportUsingMapsAndList report = new StudentsMarksReportUsingMapsAndList();

        // Adding marks
        report.addMark("Alice", 85);
        report.addMark("Alice", 90);
        report.addMark("Bob", 70);
        report.addMark("Bob", 75);
        report.addMark("Charlie", 95);
        report.addMark("Charlie", 100);

        // Display average marks
        System.out.println("Alice's Average: " + report.calculateAverage("Alice"));
        System.out.println("Bob's Average: " + report.calculateAverage("Bob"));
        System.out.println("Charlie's Average: " + report.calculateAverage("Charlie"));

        // Display top student
        System.out.println("Top Student: " + report.getTopStudent());
    }
}
