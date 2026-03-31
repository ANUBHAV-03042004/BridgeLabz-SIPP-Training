import java.util.Scanner;

public class GreatestFactorUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // Default value

        // Loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i; // Found greatest factor
                break;              // Exit after first match
            }
        }

        // Output the greatest factor
        System.out.println("Greatest factor (besides itself): " + greatestFactor);
    }
}
