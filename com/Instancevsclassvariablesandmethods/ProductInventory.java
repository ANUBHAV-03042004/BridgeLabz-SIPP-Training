package Instancevsclassvariablesandmethods;

public class ProductInventory {
 // Instance variables: Unique for each product
 private String productName;
 private double price;

 // Class variable: Shared by all instances
 private static int totalProducts = 0;
 // Constructor
 public ProductInventory(String productName, double price) {
     this.productName = productName;
     this.price = price;
     totalProducts++;  // Increase count every time a product is created
 }

 // Instance method to display individual product details
 public void displayProductDetails() {
     System.out.println("Product: " + productName + ", Price: ₹" + price);
 }

 // Class method to display total number of products created
 public static void displayTotalProducts() {
     System.out.println("Total Products: " + totalProducts);
 }

 public static void main(String[] args) {
     ProductInventory p1 = new ProductInventory("Laptop", 55000);
     ProductInventory p2 = new ProductInventory("Headphones", 1500);

     p1.displayProductDetails();
     p2.displayProductDetails();

     ProductInventory.displayTotalProducts(); // Static method call
 }
}
