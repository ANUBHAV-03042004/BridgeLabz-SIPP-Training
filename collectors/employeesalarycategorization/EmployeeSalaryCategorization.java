package employeesalarycategorization;

	import java.util.*;
	import java.util.stream.*;

	public class EmployeeSalaryCategorization {
	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("Alice", "HR", 50000),
	            new Employee("Bob", "IT", 70000),
	            new Employee("Charlie", "HR", 60000),
	            new Employee("David", "IT", 80000),
	            new Employee("Eve", "Finance", 75000)
	        );

	        Map<String, Double> avgSalaryByDept = employees.stream()
	            .collect(Collectors.groupingBy(Employee::getDepartment,
	                    Collectors.averagingDouble(Employee::getSalary)));

	        avgSalaryByDept.forEach((dept, avg) -> 
	            System.out.println(dept + " -> Avg Salary: " + avg));
	    }
	}
