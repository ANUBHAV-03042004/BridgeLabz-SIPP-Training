package linkedlist.singlylinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	 StudentRecordManagementSystem list = new  StudentRecordManagementSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll No");
            System.out.println("5. Search by Roll No");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int rollNo, pos, age;
            char grade;
            String name;

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No, Name, Age, Grade: ");
                    rollNo = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.addAtBeginning(rollNo, name, age, grade);
                    break;
                case 2:
                    System.out.print("Enter Roll No, Name, Age, Grade: ");
                    rollNo = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.addAtEnd(rollNo, name, age, grade);
                    break;
                case 3:
                    System.out.print("Enter Position, Roll No, Name, Age, Grade: ");
                    pos = sc.nextInt();
                    rollNo = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.addAtPosition(pos, rollNo, name, age, grade);
                    break;
                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    rollNo = sc.nextInt();
                    list.deleteByRollNo(rollNo);
                    break;
                case 5:
                    System.out.print("Enter Roll No to search: ");
                    rollNo = sc.nextInt();
                    list.searchByRollNo(rollNo);
                    break;
                case 6:
                    System.out.print("Enter Roll No and new Grade: ");
                    rollNo = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.updateGrade(rollNo, grade);
                    break;
                case 7:
                    list.displayAll();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
