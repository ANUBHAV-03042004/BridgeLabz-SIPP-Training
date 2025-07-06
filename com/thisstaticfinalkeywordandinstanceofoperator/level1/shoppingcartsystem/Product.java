package thisstaticfinalkeywordandinstanceofoperator.level1.shoppingcartsystem;

public class Product {
    // Static variable shared by all products (e.g., flat discount on all items)
    private static double discountPercent = 10.0;

    // Final variable: productID cannot be changed after initialization
    private final int productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to resolve ambiguity
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount for all products
    public static void updateDiscount(double newDiscountPercent) {
        discountPercent = newDiscountPercent;
    }

    // Method to calculate total cost after discount
    public double getTotalPriceAfterDiscount() {
        double total = price * quantity;
        double discountAmount = total * (discountPercent / 100);
        return total - discountAmount;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total (after " + discountPercent + "% discount): Rs. " + getTotalPriceAfterDiscount());
    }

    // Static method to safely handle objects with instanceof
    public static void processProduct(Object obj) {
        if (obj instanceof Product) {
            System.out.println("This is a Product:");
            ((Product) obj).displayProductDetails();
        } else {
            System.out.println("This object is NOT a Product.");
        }
    }
}
