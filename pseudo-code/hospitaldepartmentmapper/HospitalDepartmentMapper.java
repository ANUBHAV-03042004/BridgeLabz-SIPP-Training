package hospitaldepartmentmapper;

import java.util.*;

public class HospitalDepartmentMapper {
 public static void main(String[] args) {
     Map<String, List<Doctor>> hospital = new HashMap<>();

     // Adding doctors
     hospital.put("Cardiology", Arrays.asList(
         new Doctor("Dr. Smith", "Heart"),
         new Doctor("Dr. Lee", "Heart")
     ));
     hospital.put("Neurology", Arrays.asList(
         new Doctor("Dr. Brown", "Brain"),
         new Doctor("Dr. Green", "Brain")
     ));

     // Display
     hospital.forEach((dept, docs) -> {
         System.out.println("Department: " + dept);
         docs.forEach(System.out::println);
     });

     // Filter doctors by specialization
     String filter = "Brain";
     System.out.println("\nDoctors specialized in " + filter + ":");
     hospital.values().stream()
             .flatMap(List::stream)
             .filter(d -> d.specialization.equalsIgnoreCase(filter))
             .forEach(System.out::println);
 }
}
