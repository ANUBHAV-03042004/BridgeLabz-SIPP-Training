package encapsulationpolymorphisminterfaceandabstractclass.employeemanagementsystem;

//Abstract class for Employee
abstract class Employee implements Department {
 private int employeeId;
 private String name;
 private double baseSalary;
 private String department;

 // Constructor
 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 // Getters and Setters
 public int getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public double getBaseSalary() {
     return baseSalary;
 }

 // Implement Department methods
 public void assignDepartment(String deptName) {
     this.department = deptName;
 }

 public String getDepartmentDetails() {
     return department;
 }

 // Abstract method
 public abstract double calculateSalary();

 // Concrete method
 public void displayDetails() {
     System.out.println("ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Base Salary: " + baseSalary);
     System.out.println("Department: " + department);
     System.out.println("Final Salary: " + calculateSalary());
     System.out.println("-----------------------------");
 }
}

