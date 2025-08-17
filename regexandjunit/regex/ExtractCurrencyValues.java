package regex;
import java.util.*;
import java.util.regex.*;
public class ExtractCurrencyValues {
	   public static List<String> extractCurrency(String text) {
	        List<String> values = new ArrayList<>();
	        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
	        while (m.find()) values.add(m.group());
	        return values;
	    }
		  public static void main(String[] args) {
			     System.out.println("Currency: " + extractCurrency("Price is $45.99, discount 10.50"));
		  }
}
