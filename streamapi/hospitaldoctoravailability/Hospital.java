package hospitaldoctoravailability;

import java.util.*;
import java.util.stream.*;

public class Hospital {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. John", "Neurology", false),
            new Doctor("Dr. Clara", "Orthopedics", true),
            new Doctor("Dr. Rita", "Dermatology", true)
        );

        doctors.stream()
               .filter(d -> d.weekendAvailable)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}
