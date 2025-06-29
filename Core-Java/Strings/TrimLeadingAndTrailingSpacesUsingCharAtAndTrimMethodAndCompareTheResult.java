import java.util.Scanner;

public class TrimLeadingAndTrailingSpacesUsingCharAtAndTrimMethodAndCompareTheResult {

    // Method to find the start and end index of non-space characters
    public static int[] findTrimBounds(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring manually using charAt
    public static String manualSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        // Built-in trim
        String builtInTrim = input.trim();

        // Custom trim using charAt
        int[] bounds = findTrimBounds(input);
        String customTrim = manualSubstring(input, bounds[0], bounds[1]);

        // Compare and display
        boolean isSame = compareStrings(builtInTrim, customTrim);

        System.out.println("\nBuilt-in trim: [" + builtInTrim + "]");
        System.out.println("Custom trim : [" + customTrim + "]");
        System.out.println("Are both equal? " + isSame);
    }
}
