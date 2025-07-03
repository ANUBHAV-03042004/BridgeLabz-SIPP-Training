package javaconstructors.accessmodifiers.universitymanagementsystem;
//subclass
class PostgraduateStudent extends UniversityManagementSystem {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNumber);         // Public
        System.out.println("Name: " + name);                  // Protected
        System.out.println("CGPA: " + getCGPA());             // Private via getter
    }
}
