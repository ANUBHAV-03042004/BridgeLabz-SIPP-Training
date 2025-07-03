package javaconstructors.accessmodifiers.employeerecords;

public class Employee {
public int employeeId;
protected String department;
private double salary;

 Employee(int employeeId,String department,double salary)
{
	this.employeeId=employeeId;
	this.department=department;
	this.salary=salary;
}
 public double getSalary()
 {
	 return salary;
 }
}
