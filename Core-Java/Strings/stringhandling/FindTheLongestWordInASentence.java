package stringhandling;
import java.util.Scanner;
public class FindTheLongestWordInASentence {
	// Longest Word in Sentence
	public static String longestWord(String sentence) {
	String[] words = sentence.split(" ");
	String longest = "";
	for (String word : words) {
	 if (word.length() > longest.length()) longest = word;
	}
	return longest;
	}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String :");
    String input=sc.nextLine();
  System.out.println(longestWord(input));
}
}


























