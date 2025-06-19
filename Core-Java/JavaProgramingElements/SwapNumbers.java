import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input for number1 and number2
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Step 2: Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Step 3: Print the swapped output
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        input.close();
    }
}
