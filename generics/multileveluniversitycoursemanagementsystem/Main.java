package multileveluniversitycoursemanagementsystem;

public class Main {
	    public static void main(String[] args) {
	        java.util.List<ExamCourse> exams = java.util.Arrays.asList(
	                new ExamCourse("Math Exam"),
	                new ExamCourse("Physics Exam")
	        );

	        java.util.List<AssignmentCourse> assignments = java.util.Arrays.asList(
	                new AssignmentCourse("Java Assignment"),
	                new AssignmentCourse("DBMS Assignment")
	        );

	        CourseManager.displayCourses(exams);
	        CourseManager.displayCourses(assignments);
	    }
	}