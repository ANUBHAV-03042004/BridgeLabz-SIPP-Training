package objectorienteddesignprinciples.objectrelationshipsandcommunication.associationandaggregation;
	import java.util.ArrayList;
	import java.util.List;

	class Course {
	    private String name;
	    private List<Student> students;

	    public Course(String name) {
	        this.name = name;
	        this.students = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void listStudents() {
	        System.out.println("Students enrolled in " + name + ":");
	        for (Student student : students) {
	            System.out.println("- " + student.getName());
	        }
	    }

	    public String getName() {
	        return name;
	    }
	}

	class Student {
	    private String name;
	    private List<Course> courses;

	    public Student(String name) {
	        this.name = name;
	        this.courses = new ArrayList<>();
	    }

	    public void enrollCourse(Course course) {
	        courses.add(course);
	        course.addStudent(this);
	    }

	    public void viewCourses() {
	        System.out.println("Courses for " + name + ":");
	        for (Course course : courses) {
	            System.out.println("- " + course.getName());
	        }
	    }

	    public String getName() {
	        return name;
	    }
	}

	class School {
	    private String name;
	    private List<Student> students;

	    public School(String name) {
	        this.name = name;
	        this.students = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void listStudents() {
	        System.out.println("Students in " + name + ":");
	        for (Student student : students) {
	            System.out.println("- " + student.getName());
	        }
	    }
	}
	public class SchoolAndStudentWithCourses { 
	    public static void main(String[] args) {
	        // Create School
	        School highSchool = new School("High School");

	        // Create Students
	        Student alice = new Student("Alice");
	        Student bob = new Student("Bob");

	        // Create Courses
	        Course math = new Course("Math");
	        Course science = new Course("Science");

	        // Add Students to School (Aggregation)
	        highSchool.addStudent(alice);
	        highSchool.addStudent(bob);

	        // Enroll Students in Courses (Association)
	        alice.enrollCourse(math);
	        alice.enrollCourse(science);
	        bob.enrollCourse(math);

	        // Demonstrate functionality
	        highSchool.listStudents();
	        alice.viewCourses();
	        math.listStudents();
	        science.listStudents();
	    }
	}