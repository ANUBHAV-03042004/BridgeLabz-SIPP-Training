package stringhandling;
import java.util.*;
public class RemoveACharacterFromAString {
	// Remove Specific Character
	public static String removeChar(String str, char toRemove) {
	return str.replace(String.valueOf(toRemove), "");
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input = sc.nextLine();
	    System.out.print("Enter the character to remove: ");
	    char charactertoremove=sc.next().charAt(0);
	  System.out.println(removeChar(input,charactertoremove));
	     sc.close();
	}
}

