import java.util.Scanner;


public class SplitTheStringIntoWordsAndReturnWordsWithLengthIn2DArray {

    // Method to split the text into words using charAt
    public static String[] customSplit(String text) {
        String[] words = new String[100]; // Temporary large array
        int index = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            }
        }

        if (word.length() > 0) {
            words[index++] = word.toString(); // last word
        }

        // Trim array to actual size
        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }

        return result;
    }

    // Method to find the length of a string without using length()
    public static int findLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // index out of bounds
        }
        return count;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    // Method to display 2D array
    public static void displayTable(String[][] table) {
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordLengthTable(words);
        displayTable(table);
    }
}
