import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for a, b, c
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Step 2: Perform operations
        double result1 = a + b * c;        // Multiplication before addition
        double result2 = a * b + c;        // Multiplication before addition
        double result3 = c + a / b;        // Division before addition
        double result4 = a % b + c;        // Modulus before addition

        // Step 3: Output the results
        System.out.printf("The results of Double Operations are: %.2f, %.2f, %.2f, %.2f%n", result1, result2, result3, result4);

        sc.close();
    }
}
