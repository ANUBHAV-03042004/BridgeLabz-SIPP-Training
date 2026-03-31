import java.util.Scanner;

public class SplitTheStringUsingBuiltInAndUserDefinedFunctionAndCompareTheResult {

    // Method to count the number of words in the string
    public static int countWords(String text) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }
        return count;
    }

    // Method to split text using charAt (custom logic)
    public static String[] customSplit(String text) {
        int wordCount = countWords(text);
        String[] words = new String[wordCount];

        int index = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                words[index++] = sb.toString();
                sb.setLength(0);
            }
        }

        if (sb.length() > 0) {
            words[index] = sb.toString(); // add last word
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] builtInSplit = input.split(" ");
        String[] customSplit = customSplit(input);

        boolean isEqual = compareArrays(builtInSplit, customSplit);

        System.out.println("\nBuilt-in split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nCustom split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both splits equal? " + isEqual);
    }
}
