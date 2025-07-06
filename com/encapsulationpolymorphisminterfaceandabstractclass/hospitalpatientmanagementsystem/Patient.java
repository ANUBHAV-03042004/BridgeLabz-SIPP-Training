package encapsulationpolymorphisminterfaceandabstractclass.hospitalpatientmanagementsystem;


import java.util.ArrayList;

public abstract class Patient implements MedicalRecord {
    // Encapsulated private data
    private int patientId;
    private String name;
    private int age;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Method to get patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Interface method to add record
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    // Interface method to view all records
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}
