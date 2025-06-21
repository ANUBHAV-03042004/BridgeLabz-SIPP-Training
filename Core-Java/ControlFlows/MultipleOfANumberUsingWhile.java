import java.util.Scanner;

public class MultipleOfANumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 1;

            // Loop from 1 to 99
            System.out.println("Multiples of " + number + " below 100:");
            while (number * counter < 100) {
                System.out.println(number * counter); // Print multiple
                counter++;
            }
        } else {
            System.out.println("Invalid input. Enter a number < 100.");
        }
    }
}
