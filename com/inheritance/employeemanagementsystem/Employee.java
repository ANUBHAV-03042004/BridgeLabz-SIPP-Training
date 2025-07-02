package inheritance.employeemanagementsystem;

public class Employee {
//	parent class with common attributes
	    protected String name;
	    protected int id;
	    protected double salary;

	    public Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    public void displayDetails() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
	    }
}
