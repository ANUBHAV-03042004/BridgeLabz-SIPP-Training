package shoppingsystem;
import java.util.*;
class ShoppingCart {
    Map<String, Double> prices = new HashMap<>();
    Map<String, Double> linkedOrder = new LinkedHashMap<>();

    public void addItem(String item, double price) {
        prices.put(item, price);
        linkedOrder.put(item, price);
    }

    public void displaySortedByPrice() {
        TreeMap<Double, String> sorted = new TreeMap<>();
        for (Map.Entry<String, Double> e : prices.entrySet()) {
            sorted.put(e.getValue(), e.getKey());
        }
        System.out.println("Items sorted by price: " + sorted);
    }
    public static void main(String[] args) {
    	  ShoppingCart cart = new ShoppingCart();
          cart.addItem("Laptop", 1200);
          cart.addItem("Mouse", 25);
          cart.addItem("Keyboard", 75);

          System.out.println("\n--- Shopping Cart ---");
          cart.displaySortedByPrice();

    }
}