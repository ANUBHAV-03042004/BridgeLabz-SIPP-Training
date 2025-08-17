
public class ValidateLicensePlate {
	  public static boolean validateLicensePlate(String plate) {
	        return plate.matches("^[A-Z]{2}\\d{4}$");
	    }
	  public static void main(String[] args) {
		  System.out.println("License Plate valid? " + validateLicensePlate("AB1234"));
}
}
