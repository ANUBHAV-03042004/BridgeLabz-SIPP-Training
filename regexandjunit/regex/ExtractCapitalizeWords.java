package regex;
import java.util.regex.*;
import java.util.*;
public class ExtractCapitalizeWords {
	public static List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Matcher m = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(text);
        while (m.find()) words.add(m.group());
        return words;
    }
	  public static void main(String[] args) {
	 System.out.println("Capitalized Words: " + extractCapitalizedWords("The Eiffel Tower in Paris"));
}
}
