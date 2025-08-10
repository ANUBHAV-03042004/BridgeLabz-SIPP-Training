package insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Main {
	  public static void main(String[] args) {
	        InsurancePolicyManagement ipm = new InsurancePolicyManagement();
	        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        Policy p1 = new Policy("P001", "John Doe", LocalDate.parse("2025-08-20", fmt), "Health", 5000);
	        Policy p2 = new Policy("P002", "Alice Smith", LocalDate.parse("2025-08-15", fmt), "Auto", 3000);
	        Policy p3 = new Policy("P003", "Bob Brown", LocalDate.parse("2025-09-05", fmt), "Home", 4000);
	        Policy p4 = new Policy("P002", "Alice Smith Duplicate", LocalDate.parse("2025-09-10", fmt), "Auto", 3200);

	        ipm.addPolicy(p1);
	        ipm.addPolicy(p2);
	        ipm.addPolicy(p3);
	        ipm.addPolicy(p4);

	        ipm.displayAllPolicies();
	        ipm.displayExpiringSoon();
	        ipm.displayByCoverage("Auto");

	        List<Policy> sampleList = Arrays.asList(p1, p2, p3, p4);
	        ipm.findDuplicates(sampleList);
	    }
}