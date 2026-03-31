import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        // Use infinite loop until user enters 0 or negative
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = sc.nextInt();

            // Break if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // Add number to sum
            sum += num;
        }

        // Display the total sum
        System.out.println("The total sum is: " + sum);
    }
}
