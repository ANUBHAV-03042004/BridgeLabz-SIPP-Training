package inheritance.heirarchicalinheritance.schoolsystemwithdifferentroles;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("\n--- Role: Teacher ---");
        displayBasicInfo();
        System.out.println("Subject: " + subject);
    }
}
