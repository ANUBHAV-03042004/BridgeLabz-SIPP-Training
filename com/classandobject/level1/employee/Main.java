package classandobject.level1.employee;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name Of Employee:");
		String emp_name=sc.next();
		System.out.println("Enter the ID Of Employee:");
		int emp_id=sc.nextInt();
		System.out.println("Enter the Salary Of Employee:");
		double emp_salary=sc.nextDouble();
		Employee employee=new Employee(emp_name,emp_id,emp_salary);
		employee.displayResult();
		sc.close();
	}
}