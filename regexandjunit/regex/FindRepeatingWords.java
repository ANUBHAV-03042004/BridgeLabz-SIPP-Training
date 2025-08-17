package regex;
import java.util.*;
import java.util.regex.*;
public class FindRepeatingWords {
	   public static List<String> findRepeatingWords(String text) {
	        List<String> repeats = new ArrayList<>();
	        Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);
	        while (m.find()) repeats.add(m.group(1));
	        return repeats;
	    }
	  public static void main(String[] args) {
	 System.out.println("Repeats: " + findRepeatingWords("This is is a repeated repeated test"));
}
}
