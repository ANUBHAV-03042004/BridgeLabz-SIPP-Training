import java.util.Scanner;

public class ConvertTextIntoLowerCaseUsingBuiltInAndUserDefind {
    public static String toLowerManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c += 32; // ASCII conversion
            }
            result += c;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String custom = toLowerManual(input);
        String builtin = input.toLowerCase();

        System.out.println("Manual Lowercase: " + custom);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Strings Equal? " + compareStrings(custom, builtin));
    }
}
