import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Output the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);

        input.close();
    }
}
