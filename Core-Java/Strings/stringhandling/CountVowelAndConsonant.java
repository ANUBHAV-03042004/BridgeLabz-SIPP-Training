package stringhandling;

import java.util.Scanner;
public class CountVowelAndConsonant {

	 // Method to count vowels and consonants
	 public static void countVowelsAndConsonants(String str) {
	     int vowels = 0, consonants = 0;
	     str = str.toLowerCase();
	     for (int i = 0; i < str.length(); i++) {
	         char ch = str.charAt(i);
	         if (ch >= 'a' && ch <= 'z') {
	             if ("aeiou".indexOf(ch) != -1) vowels++;
	             else consonants++;
	         }
	     }
	     System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
	 }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
    countVowelsAndConsonants(input);
}
}




















































