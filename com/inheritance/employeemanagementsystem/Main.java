package inheritance.employeemanagementsystem;

public class Main {
	    public static void main(String[] args) {
	        Employee[] employees = {
	            new Manager("Anita", 101, 90000, 5),
	            new Developer("Raj", 102, 70000, "Java"),
	            new Intern("Simran", 103, 15000, "IIT Delhi")
	        };

	        for (Employee e : employees) {
	            e.displayDetails();
	            System.out.println("---------------");
	        }
	    }
	}
