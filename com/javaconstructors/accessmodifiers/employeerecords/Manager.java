package javaconstructors.accessmodifiers.employeerecords;

public class Manager extends Employee{
	Manager(int employeeId,String department,double salary)
	{
		super(employeeId,department,salary);
	}
	public void displayEmployeeDetails()
	{
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Department :"+department);
		System.out.println("salary :"+getSalary());
	}
}
