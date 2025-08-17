import java.util.*;
import java.util.regex.*;
public class ExtractProgrammingLanguage {
	public static List<String> extractLanguages(String text) {
        List<String> langs = new ArrayList<>();
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (m.find()) langs.add(m.group());
        return langs;
    }
	  public static void main(String[] args) {
	   System.out.println("Languages: " + extractLanguages("I know Java, Python and Go"));
}
}