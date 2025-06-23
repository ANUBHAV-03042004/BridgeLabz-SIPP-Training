import java.util.Scanner;

public class AthleteRoundsInTriangularPark {
    // Method to calculate number of rounds needed to complete 5km
    public static double findRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side A (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side B (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side C (meters): ");
        double c = sc.nextDouble();

        double rounds = findRounds(a, b, c);
        System.out.printf("Athlete must complete %.2f rounds to cover 5 km.%n", rounds);

        sc.close();
    }
}
