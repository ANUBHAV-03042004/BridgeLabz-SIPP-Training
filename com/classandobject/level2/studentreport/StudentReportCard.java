package classandobject.level2.studentreport;

public class StudentReportCard {
	    String name;
	    int rollNumber;
	    int marks;

	    StudentReportCard(String name, int rollNumber, int marks) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = marks;
	    }

	    // Method to calculate grade
	    String calculateGrade() {
	        if (marks >= 90) return "A";
	        else if (marks >= 75) return "B";
	        else if (marks >= 60) return "C";
	        else if (marks >= 40) return "D";
	        else return "F";
	    }

	    // Method to display student details and grade
	    void displayStudentInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + calculateGrade());
	    }
	}