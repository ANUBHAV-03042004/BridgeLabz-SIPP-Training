package emailfilteringsystem;
import java.util.*;
public class EmailFilteringSystem {
    public static void main(String[] args) {
        EmailManager manager = new EmailManager();

        // Adding employees (valid + invalid emails)
        manager.addEmployee("Alice", "alice@company.com");
        manager.addEmployee("Bob", "bob@company.com");
        manager.addEmployee("Charlie", "charlie@gmail.com"); // invalid
        manager.addEmployee("David", "david@company.com");
        manager.addEmployee("Eve", "eve_company.com"); // invalid

        System.out.println("\n🔎 Searching employees by domain:");
        try {
            List<Employee> companyEmployees = manager.searchByDomain("company.com");
            for (Employee emp : companyEmployees) {
                System.out.println(emp);
            }
        } catch (NoEmployeeFoundException e) {
            System.err.println(e.getMessage());
        }

        // Searching a domain with no employees
        try {
            manager.searchByDomain("gmail.com");
        } catch (NoEmployeeFoundException e) {
            System.err.println("⚠ " + e.getMessage());
        }
    }
}