package stringhandling;
import java.util.*;
public class ReplaceWordInASentence {
	// Replace Word in Sentence
	public static String replaceWord(String sentence, String oldWord, String newWord) {
	return sentence.replaceAll(oldWord, newWord);
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input1 = sc.nextLine();
	    System.out.print("Enter the word to replace: ");
	    String input2 = sc.nextLine();
	    System.out.print("Enter the word to replace with: ");
	    String input3 = sc.nextLine();
	  System.out.println(replaceWord(input1,input2,input3));
	     sc.close();
	}
}



