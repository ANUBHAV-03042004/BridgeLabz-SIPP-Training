import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Input distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Step 2: Convert to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Step 3: Output the result
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.5f%n",
                          distanceInYards, distanceInMiles);

        input.close();
    }
}
