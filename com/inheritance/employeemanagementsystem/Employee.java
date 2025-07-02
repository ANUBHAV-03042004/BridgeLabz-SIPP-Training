package inheritance.employeemanagementsystem;

public class Employee {
//	parent class with common attributes
	    private String name;
	    private int id;
	    private double salary;

	    public void setname(String name) {
	    	this.name=name;
	    }
	    public String getname()
	    {
	    	return name;
	    }

	    public void setid(int id) {
	    	this.id=id;
	    }
	    public int getid()
	    {
	    	return id;
	    }

	    public void setsalary(double salary) {
	    	this.salary=salary;
	    }
	    public double getsalary()
	    {
	    	return salary;
	    }
	    
//	    public Employee(String name, int id, double salary) {
//	        this.name = name;
//	        this.id = id;
//	        this.salary = salary;
//	    }

	    public void displayDetails() {
	        System.out.println("ID: " + getid() + ", Name: " + getname() + ", Salary: ₹" + getsalary());
	    }
}
