package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.stringbuilder;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Call the reverseString method and print the result
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
    public static String reverseString(String str) {
        // Create a StringBuilder object and initialize it with the input string
        StringBuilder sb = new StringBuilder(str);

        // Use the reverse() method provided by StringBuilder to reverse the content
        sb.reverse();

        // Convert the reversed StringBuilder back to a String and return it
        return sb.toString();
    }
}
