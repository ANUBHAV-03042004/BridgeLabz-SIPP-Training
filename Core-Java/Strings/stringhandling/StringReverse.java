package stringhandling;
import java.util.Scanner;
public class StringReverse {
	// method to Reverse a String
	public static String reverseString(String str) {
	    String rev = "";
	    for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
	    return rev;
	}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
     System.out.println(reverseString(input));
     sc.close();
}
}

