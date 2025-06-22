import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true; // Assume prime initially

        // Check for numbers <= 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop to check if divisible by any number
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Not a prime
                }
            }
        }

        // Output result
        if (isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is not a Prime number.");
    }
}
