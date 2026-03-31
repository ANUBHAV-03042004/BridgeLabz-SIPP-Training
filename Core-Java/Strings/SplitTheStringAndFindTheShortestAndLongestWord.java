import java.util.Scanner;
public class SplitTheStringAndFindTheShortestAndLongestWord {

    // Method to calculate string length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return count;
    }

    // Method to split words using charAt() without split()
    public static String[] splitWords(String text) {
        int length = getLength(text);
        String[] tempWords = new String[length]; // Max possible words
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    tempWords[wordCount++] = currentWord;
                    currentWord = "";
                }
            }
        }

        if (!currentWord.equals("")) {
            tempWords[wordCount++] = currentWord;
        }

        // Trim array to actual word count
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = tempWords[i];
        }
        return words;
    }

    // Method to get word lengths in a 2D array
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word
    public static String[] findShortestAndLongest(String[][] wordData) {
        int minLen = Integer.MAX_VALUE, maxLen = Integer.MIN_VALUE;
        String shortest = "", longest = "";

        for (int i = 0; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = wordData[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordData[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    // Method to display word table
    public static void displayWordTable(String[][] data) {
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Step 1: Split words
        String[] words = splitWords(input);

        // Step 2: Get word and length pairs
        String[][] wordTable = getWordsAndLengths(words);
        displayWordTable(wordTable);

        // Step 3: Find shortest and longest
        String[] result = findShortestAndLongest(wordTable);

        System.out.println("\nShortest Word: " + result[0]);
        System.out.println("Longest Word : " + result[1]);
    }
}
