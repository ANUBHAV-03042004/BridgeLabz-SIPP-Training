package regex;
public class ValidateIPAddress {
	   public static boolean validateIPAddress(String ip) {
	        String regex = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
	        return ip.matches(regex);
	    }
	   public static void main(String[] args) {
	System.out.println("IP Valid? " + validateIPAddress("192.168.1.1"));
	   }
}
