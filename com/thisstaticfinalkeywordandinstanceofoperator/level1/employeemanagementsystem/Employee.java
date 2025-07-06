package thisstaticfinalkeywordandinstanceofoperator.level1.employeemanagementsystem;

public class Employee {
    // Static: shared among all employees
    private static String companyName = "TechNova Pvt. Ltd.";
    private static int totalEmployees = 0;

    // Final: employee ID should not change once assigned
    private final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++; // increment total count when new employee is added
    }

    // Static method to display company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Static method to show total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    // Static method to check and show employee details using instanceof
    public static void showIfEmployee(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("This is a valid Employee object.");
            ((Employee) obj).displayEmployeeDetails();
        } else {
            System.out.println("This is NOT an Employee object.");
        }
    }
}
