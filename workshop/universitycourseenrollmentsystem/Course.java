package universitycourseenrollmentsystem;

import java.util.*;

public class Course {
    int facultyid;
    String coursename;
    String facultyname;

    ArrayList<Student> enrolledStudents;
    ArrayList<Faculty> assignedFaculty;

    Course(String coursename, int facultyid, String facultyname) {
        this.facultyid = facultyid;
        this.facultyname = facultyname;
        this.coursename = coursename;
        this.enrolledStudents = new ArrayList<>();
        this.assignedFaculty = new ArrayList<>();
    }

    Course(int facultyid, String facultyname) {
        this.facultyid = facultyid;
        this.facultyname = facultyname;
        this.enrolledStudents = new ArrayList<>();
        this.assignedFaculty = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void addFaculty(Faculty faculty) {
        assignedFaculty.add(faculty);
    }

    public void gettranscript() {
        System.out.println("Course: " + coursename);
        System.out.println("Faculty: ");
        for (Faculty f : assignedFaculty) {
            System.out.println("• " + f.facultyname);
        }

        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("• " + s.studentname);
        }
    }
}
