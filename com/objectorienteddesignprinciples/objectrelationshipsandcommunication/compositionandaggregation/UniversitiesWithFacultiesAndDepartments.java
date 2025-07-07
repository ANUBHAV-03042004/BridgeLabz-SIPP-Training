package objectorienteddesignprinciples.objectrelationshipsandcommunication.compositionandaggregation;

import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;
    private String id;

    public Faculty(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " (ID: " + id + ")";
    }
}

class Department {
    private String name;
    private List<Faculty> faculty;

    public Department(String name) {
        this.name = name;
        this.faculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty facultyMember) {
        faculty.add(facultyMember);
    }

    public void listFaculty() {
        System.out.println("Faculty in " + getName() + " department:");
        for (Faculty f : faculty) {
            System.out.println("- " + f);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculty;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculty = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty facultyMember, String deptName) {
        faculty.add(facultyMember);
        for (Department dept : departments) {
            if (deptName.equals(dept.getName())) {
                dept.addFaculty(facultyMember);
                break;
            }
        }
    }

    public void listDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department dept : departments) {
            dept.listFaculty();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

public class UniversitiesWithFacultiesAndDepartments {
    public static void main(String[] args) {
//         Create Faculty (can exist independently) 
//    	aggregation
        Faculty drSmith = new Faculty("Dr. Smith", "F001");
        Faculty draks=new Faculty("Dr. Anubhav","A001");
        // Create University and Department
        University stateU = new University("State University");
        stateU.addDepartment("CS");
        stateU.addDepartment("CIVIL");

        // Add Faculty to University and Department
        stateU.addFaculty(drSmith, "CS");
        stateU.addFaculty(draks, "CIVIL");

        // List Departments and Faculty
        stateU.listDepartments();

        // Demonstrate Composition: Deleting University
        stateU = null;
        System.gc(); // Suggest garbage collection (Departments are deleted)
        System.out.println("University deleted, Departments gone, but Faculty persists: " + drSmith);

        // Faculty still exists (Aggregation)
    }
}