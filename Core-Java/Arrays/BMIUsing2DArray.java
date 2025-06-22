import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Create 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            double weight, height;

            // Input and validate weight
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            // Input and validate height
            do {
                System.out.print("Enter height (cm): ");
                height = sc.nextDouble();
            } while (height <= 0);

            height = height / 100; // Convert to meters
            double bmi = weight / (height * height);

            // Store data
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            // Determine status
            if (bmi <= 18.4) weightStatus[i] = "Underweight";
            else if (bmi <= 24.9) weightStatus[i] = "Normal";
            else if (bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        // Display results
        System.out.println("\nPerson Data:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d => Weight: %.2f kg, Height: %.2f m, BMI: %.2f, Status: %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
