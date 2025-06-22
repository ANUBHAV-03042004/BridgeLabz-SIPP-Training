import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input weight in kg
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        // Input height in cm
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI = weight / (height in meters)^2
        double bmi = weight / (heightM * heightM);

        // Determine status based on BMI range
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output results
        System.out.println("\n--- BMI Result ---");
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);
    }
}
