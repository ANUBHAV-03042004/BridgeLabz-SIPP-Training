import java.util.Scanner;

public class CheckCharacterIsAVowelOrConsonantOrNotALetter {
    // Method 1: Check character type
    public static String checkCharType(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for uniform check
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method 2: Build 2D array of [char, type]
    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    // Method 3: Display the result in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a string to analyze: ");
        String input = sc.nextLine();

        // Step 2: Analyze input and build result
        String[][] result = analyzeString(input);

        // Step 3: Display result
        displayTable(result);

        sc.close();
    }
}
