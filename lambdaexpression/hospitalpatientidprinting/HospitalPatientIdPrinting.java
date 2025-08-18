package hospitalpatientidprinting;


	//Printing patient IDs using method references

	import java.util.*;

	public class HospitalPatientIdPrinting{
	    public static void main(String[] args) {
	        List<Integer> patientIDs = Arrays.asList(101, 102, 103, 104, 105);

	        System.out.println("Patient IDs:");
	        patientIDs.forEach(System.out::println);  // Method reference
	    }
	}
