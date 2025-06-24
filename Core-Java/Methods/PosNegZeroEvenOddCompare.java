import java.util.Scanner;

public class PosNegZeroEvenOddCompare {

    // Method to check if number is positive
    public static boolean isPositive(int n) {
        return n > 0;
    }

    // Method to check if number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int a, int b) {
        return Integer.compare(a, b); // 1 if a > b, 0 if equal, -1 if a < b
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Check each number
        for (int n : nums) {
            if (n > 0)
                System.out.println(n + " is Positive and " + (isEven(n) ? "Even" : "Odd"));
            else if (n < 0)
                System.out.println(n + " is Negative");
            else
                System.out.println(n + " is Zero");
        }

        // Compare first and last elements
        int result = compare(nums[0], nums[nums.length - 1]);
        if (result > 0)
            System.out.println("First number is GREATER than the last.");
        else if (result < 0)
            System.out.println("First number is LESS than the last.");
        else
            System.out.println("First and Last numbers are EQUAL.");
        sc.close();
    }
}

