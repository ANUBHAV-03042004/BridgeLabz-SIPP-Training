package objectorienteddesignprinciples.objectrelationshipsandcommunication.composition;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " (ID: " + id + ")";
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        System.out.println("Employees in " + name + " department:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (deptName.equals(dept.getName())) {
                return dept;
            }
        }
        return null;
    }

    public void listDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department dept : departments) {
            dept.listEmployees();
        }
    }
}

public class CompanyAndDepartments{
    public static void main(String[] args) {
        // Create Company
        Company company = new Company("Tech Corp");

        // Add Departments
        company.addDepartment("Engineering");
        company.addDepartment("HR");

        // Add Employees to Departments
        Department engDept = company.getDepartment("Engineering");
        if (engDept != null) {
            engDept.addEmployee(new Employee("Alice", "E001"));
            engDept.addEmployee(new Employee("Bob", "E002"));
        } else {
            System.out.println("Engineering department not found");
        }

        Department hrDept = company.getDepartment("HR");
        if (hrDept != null) {
            hrDept.addEmployee(new Employee("Charlie", "H001"));
        } else {
            System.out.println("HR department not found");
        }

        // List Departments and Employees
        company.listDepartments();

        // Deleting company (departments and employees are also deleted implicitly)
        company = null;
        System.gc(); // Suggest garbage collection to demonstrate composition
    }
}