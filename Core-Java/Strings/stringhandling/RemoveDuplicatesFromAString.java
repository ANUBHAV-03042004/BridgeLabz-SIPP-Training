package stringhandling;

import java.util.Scanner;

public class RemoveDuplicatesFromAString {
	// Remove Duplicates from String
	public static String removeDuplicates(String str) {
	StringBuilder result = new StringBuilder();
	for (int i = 0; i < str.length(); i++) {
	   char ch = str.charAt(i);
	   if (result.indexOf(String.valueOf(ch)) == -1) result.append(ch);
	}
	return result.toString();
	}

public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	    System.out.println("Enter a String :");
	    String input=sc.nextLine();
	  System.out.println(removeDuplicates(input));
}
}










