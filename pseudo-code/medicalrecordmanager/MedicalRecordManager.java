package medicalrecordmanager;

public class MedicalRecordManager {
    public static void main(String[] args) {
        Searchable report = new LabReport("Blood Test: Normal, Sugar: High");
        report.search("Sugar");

        Printable prescription = new Prescription("Paracetamol, Vitamin D, Insulin");
        prescription.print();
    }
}
