package regex;
public class ValidateCreditCard {
	 public static boolean validateCreditCard(String card) {
	        return card.matches("^4\\d{15}$") || card.matches("^5\\d{15}$");
	    }
	  public static void main(String[] args) {
		  System.out.println("Credit Card Valid? " + validateCreditCard("4123456789012345"));
	  }
}
