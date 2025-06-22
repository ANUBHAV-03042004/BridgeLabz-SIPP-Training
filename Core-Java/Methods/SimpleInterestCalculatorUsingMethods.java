import java.util.Scanner;

public class SimpleInterestCalculatorUsingMethods {
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculating simple interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Displaying result
        System.out.println("The Simple Interest is " + interest +
            " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        sc.close();
    }
}
