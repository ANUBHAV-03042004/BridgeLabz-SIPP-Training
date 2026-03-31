import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for fee and discount percent
        System.out.print("Enter the course fee (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculating discount and final price
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Displaying the result
        System.out.printf("The discount amount is INR %.2f%n", discount);
        System.out.printf("The final discounted fee is INR %.2f%n", finalFee);

        scanner.close();
    }
}
