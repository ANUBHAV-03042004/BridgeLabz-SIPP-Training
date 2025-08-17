package regex;
import java.util.*;
import java.util.regex.*;
public class ExtractDates {
	 public static List<String> extractDates(String text) {
	        List<String> dates = new ArrayList<>();
	        Matcher m = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
	        while (m.find()) dates.add(m.group());
	        return dates;
	    }
	  public static void main(String[] args) {
	        System.out.println("Dates: " + extractDates("12/05/2023 and 29/02/2020"));
	  }
}
