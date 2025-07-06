package thisstaticfinalkeywordandinstanceofoperator.level1.hospitalmanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Display hospital name
        Patient.displayHospitalName();

        // Create some patient objects
        Patient p1 = new Patient(101, "Ananya Sharma", 30, "Fever");
        Patient p2 = new Patient(102, "Rohit Mehra", 45, "Fracture");

        // Display patient records using instanceof check
        System.out.println("\n--- Patient 1 ---");
        Patient.processPatient(p1);

        System.out.println("\n--- Patient 2 ---");
        Patient.processPatient(p2);

        // Attempt to pass a non-patient object
        System.out.println("\n--- Invalid Object ---");
        String random = "Not a patient";
        Patient.processPatient(random);

        // Show total admitted patients
        System.out.println("\n--- Summary ---");
        Patient.getTotalPatients();
    }
}
