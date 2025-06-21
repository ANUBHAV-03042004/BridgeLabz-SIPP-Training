import java.util.Scanner;

public class PowerUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base number
        System.out.print("Enter base number: ");
        int number = sc.nextInt();

        // Input power value
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;

        // Multiply number 'power' times
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print result
        System.out.println("Result: " + result);
    }
}
