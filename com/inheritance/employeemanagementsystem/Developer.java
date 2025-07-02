package inheritance.employeemanagementsystem;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
//        add programming language if role is developer
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Programming Language: " + programmingLanguage);
    }
}
