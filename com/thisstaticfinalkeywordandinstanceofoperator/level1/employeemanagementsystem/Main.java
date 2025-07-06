package thisstaticfinalkeywordandinstanceofoperator.level1.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Alice", "Developer");
        Employee emp2 = new Employee(102, "Bob", "Manager");

        // Display static company name and total employee count
        Employee.displayCompanyName();
        Employee.displayTotalEmployees();

        System.out.println("\n--- Employee 1 Details ---");
        Employee.showIfEmployee(emp1);

        System.out.println("\n--- Employee 2 Details ---");
        Employee.showIfEmployee(emp2);

        System.out.println("\n--- Invalid Object Check ---");
        Employee.showIfEmployee("NotAnEmployee");
    }
}
