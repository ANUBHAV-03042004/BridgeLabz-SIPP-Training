import java.util.Scanner;

public class TrigonometricFunctionCalculator {
    // Method to calculate sin, cos, tan of an angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[] {
            Math.sin(radians),
            Math.cos(radians),
            Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        sc.close();
    }
}
