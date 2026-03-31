import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        // If number is 0, it has 1 digit
        if (temp == 0) {
            count = 1;
        } else {
            // Loop to remove digits
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
