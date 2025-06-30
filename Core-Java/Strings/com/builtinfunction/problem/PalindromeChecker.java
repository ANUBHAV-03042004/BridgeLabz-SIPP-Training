package com.builtinfunction.problem;

import java.util.Scanner;
// check whether a string is palindrome or not
	public class PalindromeChecker {
	    public static boolean isPalindrome(String str) {
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equalsIgnoreCase(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.next();
	        System.out.println(str + (isPalindrome(str) ? " is a palindrome" : " is not a palindrome"));
	        sc.close();
	    }
}
