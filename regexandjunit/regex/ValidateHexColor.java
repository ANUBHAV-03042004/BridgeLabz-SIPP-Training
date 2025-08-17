package regex;
public class ValidateHexColor {
	  public static boolean validateHexColor(String color) {
	        return color.matches("^#[0-9A-Fa-f]{6}$");
	    }
	  public static void main(String[] args) {
	        System.out.println("Hex Color valid? " + validateHexColor("#FFA500"));
	  }
}
