import java.util.*;
import java.util.regex.*;
public class ExtractLinks {
	  public static List<String> extractLinks(String text) {
	        List<String> links = new ArrayList<>();
	        Matcher m = Pattern.compile("https?://[\\w.-]+").matcher(text);
	        while (m.find()) links.add(m.group());
	        return links;
	    }
	  public static void main(String[] args) {
	 System.out.println("Links: " + extractLinks("Visit https://google.com and http://example.org"));
}
	  }
