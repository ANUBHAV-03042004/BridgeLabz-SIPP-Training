import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and the unit price is INR %.2f%n", 
                          totalPrice, quantity, unitPrice);

        sc.close();
    }
}
