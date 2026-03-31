import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        double km;

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();  // Can also use input.nextDouble();

        // Convert km to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Display output
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);

        input.close();
    }
}
