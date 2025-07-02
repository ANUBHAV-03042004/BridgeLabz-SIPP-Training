package inheritance.employeemanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees do you want to add? ");
        int count = Integer.parseInt(sc.nextLine());

        Employee[] employees = new Employee[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for employee #" + (i + 1));
            System.out.print("Enter role (Manager / Developer / Intern): ");
            String role = sc.nextLine().trim();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            switch (role.toLowerCase()) {
                case "manager":
                    System.out.print("Enter team size: ");
                    int teamSize = Integer.parseInt(sc.nextLine());
                    employees[i] = new Manager(name, id, salary, teamSize);
                    break;

                case "developer":
                    System.out.print("Enter programming language: ");
                    String language = sc.nextLine();
                    employees[i] = new Developer(name, id, salary, language);
                    break;

                case "intern":
                    System.out.print("Enter university name: ");
                    String university = sc.nextLine();
                    employees[i] = new Intern(name, id, salary, university);
                    break;

                default:
                    System.out.println("Invalid role! Skipping this employee.");
                    i--; // Let the user try again
            }
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee e : employees) {
            if (e != null) {
                e.displayDetails();
                System.out.println("---------------");
            }
        }

        sc.close();
    }
}