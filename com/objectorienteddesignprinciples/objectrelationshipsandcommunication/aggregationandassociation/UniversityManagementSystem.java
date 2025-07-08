package objectorienteddesignprinciples.objectrelationshipsandcommunication.aggregationandassociation;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Student> students;
    private List<Professor> professors;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void listStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public void listProfessors() {
        System.out.println("Professors for " + name + ":");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
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

class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.addProfessor(this);
    }

    public void viewCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class University {
    private String name;
    private List<Student> students;
    private List<Professor> professors;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void listStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public void listProfessors() {
        System.out.println("Professors in " + name + ":");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create University
        University stateU = new University("State University");

        // Create Students and Professors
        Student alice = new Student("Alice");
        Professor drSmith = new Professor("Dr. Smith");

        // Create Course
        Course cs101 = new Course("CS101");

        // Add to University (Aggregation)
        stateU.addStudent(alice);
        stateU.addProfessor(drSmith);

        // Enroll Student and Assign Professor (Association)
        alice.enrollCourse(cs101);
        drSmith.assignCourse(cs101);

        // Demonstrate functionality
        stateU.listStudents();
        stateU.listProfessors();
        alice.viewCourses();
        drSmith.viewCourses();
        cs101.listStudents();
        cs101.listProfessors();
    }
}