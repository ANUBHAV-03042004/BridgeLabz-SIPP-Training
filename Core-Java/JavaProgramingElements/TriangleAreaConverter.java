import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height input in cm
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();

        // Calculate area in cm²
        double areaCm2 = 0.5 * base * height;

        // Convert area to in²
        double areaIn2 = areaCm2 / 6.4516;

        // Print results
        System.out.printf("The Area of the triangle in sq inches is %.2f and in sq cm is %.2f%n", areaIn2, areaCm2);

        input.close();
    }
}
