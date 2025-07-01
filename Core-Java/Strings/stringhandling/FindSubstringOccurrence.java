package stringhandling;

import java.util.Scanner;
public class FindSubstringOccurrence {
	// Count Substring Occurrences
	public static int countSubstring(String str, String sub) {
	int count = 0, index = 0;
	while ((index = str.indexOf(sub, index)) != -1) {
	count++;
	index += sub.length();
	}
	return count;
	}

public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	    System.out.println("Enter a String :");
	    String input=sc.nextLine();
	    System.out.println("Enter the substring to search :");
	    String find=sc.nextLine();
	  System.out.println(countSubstring(input, find));
}

}


























