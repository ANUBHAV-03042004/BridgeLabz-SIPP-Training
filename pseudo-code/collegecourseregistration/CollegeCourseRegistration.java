package collegecourseregistration;
import java.util.*;
public class CollegeCourseRegistration {
    public static void main(String[] args) {
        Map<Course, List<Student>> courseMap = new HashMap<>();

        // Courses
        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("CS102", "Operating Systems");

        // Students
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        Student s3 = new Student(3, "Charlie");

        // Register students
        courseMap.putIfAbsent(c1, new ArrayList<>());
        courseMap.get(c1).add(s1);
        courseMap.get(c1).add(s2);

        courseMap.putIfAbsent(c2, new ArrayList<>());
        courseMap.get(c2).add(s3);

        // Display
        for (Map.Entry<Course, List<Student>> entry : courseMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
