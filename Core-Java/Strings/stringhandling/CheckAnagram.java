package stringhandling;
import java.util.*;
public class CheckAnagram {
	// Anagram Check
	public static boolean isAnagram(String s1, String s2) {
	s1 = s1.replaceAll("\\s", "").toLowerCase();
	s2 = s2.replaceAll("\\s", "").toLowerCase();
	if (s1.length() != s2.length()) return false;
	int[] count = new int[256];
	for (char ch : s1.toCharArray()) count[ch]++;
	for (char ch : s2.toCharArray()) {
	count[ch]--;
	if (count[ch] < 0) return false;
	}
	return true;
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter string1: ");
	    String input1 = sc.nextLine();
	    System.out.print("Enter string2: ");
	    String input2 = sc.nextLine();
	  System.out.println(isAnagram(input1, input2));
	     sc.close();
	}
}



