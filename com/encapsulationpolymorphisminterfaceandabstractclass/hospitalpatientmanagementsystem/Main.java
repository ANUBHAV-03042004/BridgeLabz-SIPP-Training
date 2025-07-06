package encapsulationpolymorphisminterfaceandabstractclass.hospitalpatientmanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create patient objects
        Patient p1 = new InPatient(101, "Rahul Sharma", 45, 5, 1500);
        Patient p2 = new OutPatient(102, "Anjali Verma", 30, 600);

        // Polymorphism - handled via base class reference
        Patient[] patients = {p1, p2};

        for (Patient p : patients) {
            System.out.println("\n--- Patient Details ---");
            p.getPatientDetails();
            System.out.println("Bill Amount: Rs. " + p.calculateBill());

            // Add and show medical records
            p.addRecord("Blood test");
            p.addRecord("X-ray");
            p.viewRecords();
        }
    }
}
