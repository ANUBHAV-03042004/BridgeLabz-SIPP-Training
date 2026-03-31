import java.util.Scanner;

public class BMIWithMultiple1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Declare arrays
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            double w, h;

            // Input and validate weight
            do {
                System.out.print("Enter weight (kg): ");
                w = sc.nextDouble();
            } while (w <= 0);

            // Input and validate height
            do {
                System.out.print("Enter height (cm): ");
                h = sc.nextDouble();
            } while (h <= 0);

            weight[i] = w;
            height[i] = h / 100.0;
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine BMI status
            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // Output
        System.out.println("\nBMI Report:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d => Weight: %.2f kg, Height: %.2f m, BMI: %.2f, Status: %s%n",
                    (i + 1), weight[i], height[i], bmi[i], status[i]);
        }
    }
}
