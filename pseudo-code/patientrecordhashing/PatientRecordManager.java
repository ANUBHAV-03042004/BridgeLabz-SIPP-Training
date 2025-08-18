package patientrecordhashing;
import java.util.*;
public class PatientRecordManager {
 public static void main(String[] args) {
     HashMap<Integer, Patient> patientMap = new HashMap<>();

     // Insert patients
     patientMap.put(101, new Patient(101, "John", 30));
     patientMap.put(102, new Patient(102, "Alice", 25));

     // Retrieve
     Patient p = patientMap.get(101);
     System.out.println("Retrieved Patient: " + p.name);

     // Update
     patientMap.put(101, new Patient(101, "John Doe", 31));
     System.out.println("Updated Patient: " + patientMap.get(101).name);

     // Delete
     patientMap.remove(102);
     System.out.println("Remaining Patients: " + patientMap.size());
 }
}
