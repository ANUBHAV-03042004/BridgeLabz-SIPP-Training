package insurancepolicymanagementsystemusingmapandtreemap;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
	    public static void main(String[] args) {
	        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        // Insurance Policy Management Demo
	        InsurancePolicyManagementMap ipm = new InsurancePolicyManagementMap();
	        ipm.addPolicy(new Policy("P001", "John Doe", LocalDate.parse("2025-08-20", fmt), "Health", 5000));
	        ipm.addPolicy(new Policy("P002", "Alice Smith", LocalDate.parse("2025-08-15", fmt), "Auto", 3000));
	        ipm.addPolicy(new Policy("P003", "Bob Brown", LocalDate.parse("2025-09-05", fmt), "Home", 4000));

	        System.out.println("\n--- Insurance Policy Management ---");
	        ipm.listExpiringWithin30Days();
	        ipm.listByPolicyHolder("Alice Smith");
	        ipm.removeExpired();
	    }
}
