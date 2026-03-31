import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take base number input
        System.out.print("Enter base number: ");
        int number = sc.nextInt();

        // Take exponent input
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;        // Initial result
        int counter = 0;       // Counter variable for loop

        // Loop till counter equals power
        while (counter < power) {
            result *= number;  // Multiply result by base each time
            counter++;         // Increment counter
        }

        // Print final result
        System.out.println("Result: " + result);
    }
}
