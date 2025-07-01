package com.classandobject.level1.employee;
public class Employee {
String emp_name;
int emp_id;
double emp_salary;
	Employee (String emp_name,int emp_id,double emp_salary){
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.emp_salary=emp_salary;
	}
	public void displayResult()
	{
		System.out.println("Employee Name: "+emp_name);
		System.out.println("Employee Id: "+emp_id);
		System.out.println("Employee Salary: "+emp_salary);
	}
}
