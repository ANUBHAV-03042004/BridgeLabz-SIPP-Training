import java.util.Scanner;

public class TravelSummary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get user details
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Step 2: Get distances in miles
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = input.nextDouble();

        // Step 3: Get time in minutes
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        double timeFromToVia = input.nextDouble();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        double timeViaToFinalCity = input.nextDouble();

        // Step 4: Compute total distance in km and total time
        double totalMiles = fromToVia + viaToFinalCity;
        double totalKm = totalMiles * 1.60934;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Step 5: Display result
        System.out.printf("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes%n",
                name, fromCity, toCity, viaCity, totalKm, totalTime);

        input.close();
    }
}
