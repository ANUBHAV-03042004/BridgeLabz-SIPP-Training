package classandobject.level1.trackinventoryofitems;

public class TrackInventoryOfItems {
	    int itemCode;
	    String itemName;
	    double price;
        int quantity;
	    // Constructor to initialize item
	    TrackInventoryOfItems(int itemCode, String itemName, double price,int quantity) {
	        this.itemCode = itemCode;
	        this.itemName = itemName;
	        this.price = price;
	        this.quantity=quantity;
	    }

	    // Method to display item details
	    void displayItemDetails() {
	        System.out.println("Item Code: " + itemCode);
	        System.out.println("Item Name: " + itemName);
	        System.out.println("Price: Rs." + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Cost: Rs." + calculateTotalCost(quantity));
	    }

	    // Method to calculate total cost for given quantity
	    double calculateTotalCost(int quantity) {
	        return price * quantity;
	    }
}
