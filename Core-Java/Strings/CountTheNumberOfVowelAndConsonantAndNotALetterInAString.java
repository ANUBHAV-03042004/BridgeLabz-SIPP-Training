import java.util.Scanner;


public class CountTheNumberOfVowelAndConsonantAndNotALetterInAString {

    // Method to classify character
    public static String classifyChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32); // Convert to lowercase
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants
    public static int[] countVC(String text) {
        int vowelCount = 0, consonantCount = 0;
        for (int i = 0; i < text.length(); i++) {
            String type = classifyChar(text.charAt(i));
            if (type.equals("Vowel")) vowelCount++;
            else if (type.equals("Consonant")) consonantCount++;
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] counts = countVC(input);

        System.out.println("\nVowel Count     : " + counts[0]);
        System.out.println("Consonant Count : " + counts[1]);
    }
}
