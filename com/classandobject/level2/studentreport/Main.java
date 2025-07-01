package classandobject.level2.studentreport;

import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of Student:");
		String name=sc.nextLine();
		System.out.println("Enter the Roll Number of Student:");
		int rollnumber=sc.nextInt();
		System.out.println("Enter the Marks of Student:");
		int marks=sc.nextInt();
		StudentReportCard  studentreportcard=new StudentReportCard(name,rollnumber,marks);
		studentreportcard.displayStudentInfo();
		sc.close();
	}
}
