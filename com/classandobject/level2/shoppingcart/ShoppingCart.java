package classandobject.level2.shoppingcart;
import java.util.ArrayList;
class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
	    ArrayList<CartItem> cart = new ArrayList<>();

	    // Add item to cart
	    void addItem(CartItem item) {
	        cart.add(item);
	        System.out.println(item.itemName + " added to cart.");
	    }

	    // Remove item from cart
	    void removeItem(String itemName) {
	        cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
	        System.out.println(itemName + " removed from cart.");
	    }

	    // Display total cost
	    void displayTotal() {
	        double total = 0;
	        for (CartItem item : cart) {
	            System.out.println(item.itemName + " x" + item.quantity + " = Rs." + item.getTotalCost());
	            total += item.getTotalCost();
	        }
	        System.out.println("Total Cart Value: Rs." + total);
	    }
	}