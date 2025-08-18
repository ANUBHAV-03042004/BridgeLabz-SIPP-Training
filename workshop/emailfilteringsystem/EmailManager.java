package emailfilteringsystem;
import java.util.*;
class EmailManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, String email) {
        try {
            Employee emp = new Employee(name, email);
            employees.add(emp);
            System.out.println("✅ Added: " + emp);
        } catch (InvalidEmailFormatException e) {
            System.err.println("❌ Error adding employee " + name + ": " + e.getMessage());
        }
    }

    public List<Employee> searchByDomain(String domain) throws NoEmployeeFoundException {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getEmail().getEmailAddress().endsWith("@" + domain)) {
                result.add(emp);
            }
        }
        if (result.isEmpty()) {
            throw new NoEmployeeFoundException("No employees found for domain: " + domain);
        }
        return result;
    }
}
