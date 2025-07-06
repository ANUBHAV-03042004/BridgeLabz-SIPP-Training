package thisstaticfinalkeywordandinstanceofoperator.level1.shoppingcartsystem;

public class Main {
    public static void main(String[] args) {
        // Create some product instances
        Product p1 = new Product(1001, "Mobile Phone", 15000, 1);
        Product p2 = new Product(1002, "Headphones", 2000, 2);
        Product p3 = new Product(1003, "Charger", 800, 3);

        // Display product details using instanceof
        System.out.println("--- Product 1 ---");
        Product.processProduct(p1);

        System.out.println("\n--- Product 2 ---");
        Product.processProduct(p2);

        System.out.println("\n--- Product 3 ---");
        Product.processProduct(p3);

        // Update discount for all products
        System.out.println("\nUpdating Discount to 15% for all products...\n");
        Product.updateDiscount(15.0);

        // Show updated discount effect
        System.out.println("--- After Discount Update ---");
        Product.processProduct(p1);
    }
}
