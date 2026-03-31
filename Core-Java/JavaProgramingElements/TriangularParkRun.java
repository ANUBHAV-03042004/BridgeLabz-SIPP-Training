import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input for the three sides of the triangle
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = input.nextDouble();

        // Step 2: Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Step 3: Calculate number of rounds needed to complete 5 km
        double totalDistance = 5000; // in meters
        double rounds = totalDistance / perimeter;

        // Step 4: Display result (rounded up to nearest full round if needed)
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km%n", rounds);

        input.close();
    }
}
