package stringhandling;


import java.util.Scanner;
public class PalindromeCheck {
	// Reverse a String
	public static String reverseString(String str) {
	    String rev = "";
	    for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
	    return rev;
	}
//	method to check palindrome
	public static boolean isPalindrome(String str) {
		 return str.equals(reverseString(str));
		}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a String :");
    String input=sc.nextLine();
     System.out.println(isPalindrome(input));
}
}


























