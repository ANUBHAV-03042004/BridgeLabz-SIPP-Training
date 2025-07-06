package thisstaticfinalkeywordandinstanceofoperator.level1.hospitalmanagementsystem;

public class Patient {
    // Static variable shared by all patients
    private static String hospitalName = "City Care Hospital";

    // Final variable for unique, unchangeable patient ID
    private final int patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Static variable to keep track of total patients
    private static int totalPatients = 0;

    // Constructor using 'this' keyword to resolve variable ambiguity
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // increment patient count on each creation
    }

    // Static method to display total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Static method to display hospital name
    public static void displayHospitalName() {
        System.out.println("Hospital Name: " + hospitalName);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    // Method to safely check if an object is a Patient instance
    public static void processPatient(Object obj) {
        if (obj instanceof Patient) {
            System.out.println("Valid Patient Record:");
            ((Patient) obj).displayPatientDetails();
        } else {
            System.out.println("Invalid object. Not a Patient.");
        }
    }
}

