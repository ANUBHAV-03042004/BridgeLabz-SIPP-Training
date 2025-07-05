package linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {    
	    // Node structure
	    static class Node {
	        int rollNo;
	        String name;
	        int age;
	        char grade;
	        Node next;

	        Node(int rollNo, String name, int age, char grade) {
	            this.rollNo = rollNo;
	            this.name = name;
	            this.age = age;
	            this.grade = grade;
	            this.next = null;
	        }
	    }

	    private Node head;

	    // Add at beginning
	    public void addAtBeginning(int rollNo, String name, int age, char grade) {
	        Node newNode = new Node(rollNo, name, age, grade);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Add at end
	    public void addAtEnd(int rollNo, String name, int age, char grade) {
	        Node newNode = new Node(rollNo, name, age, grade);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    // Add at specific position (1-based)
	    public void addAtPosition(int pos, int rollNo, String name, int age, char grade) {
	        if (pos <= 0) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        if (pos == 1) {
	            addAtBeginning(rollNo, name, age, grade);
	            return;
	        }

	        Node newNode = new Node(rollNo, name, age, grade);
	        Node temp = head;
	        for (int i = 1; temp != null && i < pos - 1; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of range.");
	            return;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    // Delete by Roll Number
	    public void deleteByRollNo(int rollNo) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        if (head.rollNo == rollNo) {
	            head = head.next;
	            System.out.println("Student with Roll No " + rollNo + " deleted.");
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null && temp.next.rollNo != rollNo) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Student with Roll No " + rollNo + " not found.");
	            return;
	        }

	        temp.next = temp.next.next;
	        System.out.println("Student with Roll No " + rollNo + " deleted.");
	    }

	    // Search by Roll Number
	    public void searchByRollNo(int rollNo) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.rollNo == rollNo) {
	                System.out.println("Found: " + temp.rollNo + ", " + temp.name + ", " + temp.age + ", " + temp.grade);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Student with Roll No " + rollNo + " not found.");
	    }

	    // Update Grade by Roll Number
	    public void updateGrade(int rollNo, char newGrade) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.rollNo == rollNo) {
	                temp.grade = newGrade;
	                System.out.println("Updated grade for Roll No " + rollNo);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Student with Roll No " + rollNo + " not found.");
	    }

	    // Display all students
	    public void displayAll() {
	        if (head == null) {
	            System.out.println("No student records.");
	            return;
	        }

	        Node temp = head;
	        System.out.println("\nAll Student Records:");
	        while (temp != null) {
	            System.out.println("Roll No: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
	            temp = temp.next;
	        }
	    }
	}
