package studentmanagementsystem;

	import java.util.*;

	class Student {
	    int id;
	    String name;
	    int age;
	    Set<String> subjects; // Subjects enrolled
	    Map<String, String> grades; // Subject -> Grade

	    // Constructor
	    public Student(int id, String name, int age, Set<String> subjects, Map<String, String> grades) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.subjects = subjects;
	        this.grades = grades;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Age: " + age + 
	               ", Subjects: " + subjects + ", Grades: " + grades;
	    }
	}

	public class StudentManagementSystem {
	    // Store students by ID
	    private Map<Integer, Student> students = new HashMap<>();

	    // Add a student
	    public void addStudent(Student s) {
	        students.put(s.id, s);
	    }

	    // Remove student by ID
	    public void removeStudent(int id) {
	        students.remove(id);
	    }

	    // Search student by ID
	    public Student searchById(int id) {
	        return students.get(id);
	    }

	    // Search student by Name
	    public Student searchByName(String name) {
	        for (Student s : students.values()) {
	            if (s.name.equalsIgnoreCase(name)) {
	                return s;
	            }
	        }
	        return null;
	    }

	    // Sort students by name
	    public List<Student> sortByName() {
	        List<Student> list = new ArrayList<>(students.values());
	        list.sort(Comparator.comparing(s -> s.name));
	        return list;
	    }

	    // Sort students by grade (take average of grades A=4, B=3, C=2, D=1)
	    public List<Student> sortByGrade() {
	        List<Student> list = new ArrayList<>(students.values());
	        list.sort((s1, s2) -> Double.compare(avgGrade(s2), avgGrade(s1))); // Desc order
	        return list;
	    }

	    // Helper: calculate average grade as number
	    private double avgGrade(Student s) {
	        double sum = 0;
	        int count = 0;
	        for (String grade : s.grades.values()) {
	            switch (grade.toUpperCase()) {
	                case "A": sum += 4; break;
	                case "B": sum += 3; break;
	                case "C": sum += 2; break;
	                case "D": sum += 1; break;
	            }
	            count++;
	        }
	        return count == 0 ? 0 : sum / count;
	    }

	    // Find students enrolled in a particular subject
	    public List<Student> findBySubject(String subject) {
	        List<Student> result = new ArrayList<>();
	        for (Student s : students.values()) {
	            if (s.subjects.contains(subject)) {
	                result.add(s);
	            }
	        }
	        return result;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        StudentManagementSystem sms = new StudentManagementSystem();

	        // Create sample students
	        Student s1 = new Student(1, "Alice", 20,
	                new HashSet<>(Arrays.asList("Math", "Science")),
	                new HashMap<>(Map.of("Math", "A", "Science", "B")));

	        Student s2 = new Student(2, "Bob", 21,
	                new HashSet<>(Arrays.asList("English", "Math")),
	                new HashMap<>(Map.of("English", "C", "Math", "B")));

	        Student s3 = new Student(3, "Charlie", 22,
	                new HashSet<>(Arrays.asList("Science", "History")),
	                new HashMap<>(Map.of("Science", "A", "History", "A")));

	        // Add students
	        sms.addStudent(s1);
	        sms.addStudent(s2);
	        sms.addStudent(s3);

	        // Searching
	        System.out.println("Search by ID (2): " + sms.searchById(2));
	        System.out.println("Search by Name (Charlie): " + sms.searchByName("Charlie"));

	        // Sorting
	        System.out.println("\nStudents sorted by Name: " + sms.sortByName());
	        System.out.println("\nStudents sorted by Grade: " + sms.sortByGrade());

	        // Find students by subject
	        System.out.println("\nStudents enrolled in Math: " + sms.findBySubject("Math"));
	    }
	}
