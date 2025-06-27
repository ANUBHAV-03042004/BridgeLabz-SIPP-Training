
import java.util.*;

public class NumberCheckerUtilityExtendedMore3 {

    // Method 1: Count of digits
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    // Method 2: Store digits into array
    public static int[] getDigits(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt).toArray();
    }

    // Method 3: Reverse digit array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    // Method 4: Compare two arrays
    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // Method 5: Check Palindrome
    public static boolean isPalindrome(int n) {
        int[] original = getDigits(n);
        int[] reversed = reverseArray(original);
        return areArraysEqual(original, reversed);
    }

    // Method 6: Check Duck Number (has zero, but not at the beginning)
    public static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.contains("0") && s.charAt(0) != '0';
    }

    // Main method to run test case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Digit Count: " + countDigits(number));
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Arrays Equal: " + areArraysEqual(digits, reversed));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuck(number));
    }
}
