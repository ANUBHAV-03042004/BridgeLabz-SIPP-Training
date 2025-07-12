package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.stringbuilder;
import java.util.*;

public class RemoveDuplicateFromString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input string from user
	        System.out.print("Enter a string to remove duplicates: ");
	        String input = sc.nextLine();

	        // HashSet to track seen characters
	        Set<Character> seen = new HashSet<>();

	        // StringBuilder to build the result without duplicates
	        StringBuilder result = new StringBuilder();

	        // Iterate through each character of the input string
	        for (char c : input.toCharArray()) {
	            // If character not seen before, add to result and mark as seen
	            if (!seen.contains(c)) {
	                result.append(c);
	                seen.add(c);
	            }
	        }

	        // Output the result
	        System.out.println("String after removing duplicates: " + result.toString());
	    }
	}
