package regex;
public class ValidateAUsername {
	 public static boolean validateUsername(String username) {
	        return username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
	    }
	  public static void main(String[] args) {
	        System.out.println("Username valid? " + validateUsername("user_123"));
	  }
}
