package encapsulationpolymorphisminterfaceandabstractclass.employeemanagementsystem;

public class Main {
	    public static void main(String[] args) {
	        // Create employee array using polymorphism
	        Employee[] employees = new Employee[3];

	        employees[0] = new FullTimeEmployee(101, "Alice", 50000, 10000);
	        employees[0].assignDepartment("Finance");

	        employees[1] = new PartTimeEmployee(102, "Bob", 300, 40);
	        employees[1].assignDepartment("Customer Support");

	        employees[2] = new FullTimeEmployee(103, "Charlie", 60000, 15000);
	        employees[2].assignDepartment("IT");

	        // Display all employee details
	        for (Employee emp : employees) {
	            emp.displayDetails();
	        }
	    }
	}
