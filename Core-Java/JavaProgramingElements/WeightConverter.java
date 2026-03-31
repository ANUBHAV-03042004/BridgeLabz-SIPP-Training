import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Input weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double pounds = input.nextDouble();

        // Step 2: Convert to kilograms
        double kilograms = pounds / 2.2;

        // Step 3: Output result
        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f%n", pounds, kilograms);

        input.close();
    }
}
