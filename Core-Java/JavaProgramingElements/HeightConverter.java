import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for height in cm
        System.out.print("Enter your height in centimeters: ");
        double cm = sc.nextDouble();

        // Convert cm to total inches
        double totalInches = cm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display the result
        System.out.printf("Your Height in cm is %.2f cm while in feet is %d and %.2f inches", cm, feet, inches);

        sc.close();
    }
}
