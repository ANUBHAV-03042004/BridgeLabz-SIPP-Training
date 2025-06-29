import java.util.*;
public class CreateSubstringUsingCharAtAndSubstringBuiltInFunctionAndCompareTheResult {
    // Method to create substring manually using charAt()
    static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings character-by-character
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("Manual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);

        boolean isEqual = compareStrings(manualSub, builtInSub);
        System.out.println("Are both substrings equal? " + isEqual);
    }
}
