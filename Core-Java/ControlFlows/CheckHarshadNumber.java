import java.util.Scanner;

public class CheckHarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;                  // 3. Initialize digit sum
        int temp = number;            // Keep copy for comparison

        // 4. Loop through digits
        while (temp > 0) {
            int digit = temp % 10;    // Extract last digit
            sum += digit;             // 5. Add to sum
            temp /= 10;               // Remove digit
        }

        // 6. Check if number divisible by sum of digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}
