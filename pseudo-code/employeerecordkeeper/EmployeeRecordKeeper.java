package employeerecordkeeper;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeRecordKeeper {
 public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();
     employees.add(new Employee("Ravi", "HR"));
     employees.add(new Employee("Anubhav", "IT"));
     employees.add(new Employee("Priya", "Finance"));
     employees.add(new Employee("Rahul", "IT"));

     // Filter IT department employees
     List<Employee> itEmployees = employees.stream()
             .filter(e -> e.department.equals("IT"))
             .collect(Collectors.toList());

     System.out.println("IT Department Employees:");
     itEmployees.forEach(e -> System.out.println(e.name));
 }
}
