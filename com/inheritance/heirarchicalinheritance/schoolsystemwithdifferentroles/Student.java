package inheritance.heirarchicalinheritance.schoolsystemwithdifferentroles;

public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("\n--- Role: Student ---");
        displayBasicInfo();
        System.out.println("Grade: " + grade);
    }
}
