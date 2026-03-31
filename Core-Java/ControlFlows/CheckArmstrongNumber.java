import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;                      // 2. Initialize sum
        int originalNumber = number;      // 2. Save original number for comparison

        // 3. Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            int digit = originalNumber % 10;     // 4. Extract last digit
            sum += Math.pow(digit, 3);           // 4. Add cube of digit to sum
            originalNumber /= 10;                // 5. Remove last digit
        }

        // 6. Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}
