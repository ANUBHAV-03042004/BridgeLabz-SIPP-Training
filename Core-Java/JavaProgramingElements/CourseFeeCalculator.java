public class CourseFeeCalculator {
    public static void main(String[] args) {
        // Declare and assign the fee and discount percentage
        double fee = 125000;
        double discountPercent = 10;

        // Calculate the discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Print the result
        System.out.printf("The discount amount is INR %.2f%n", discount);
        System.out.printf("The final discounted fee is INR %.2f%n", finalFee);
    }
}
