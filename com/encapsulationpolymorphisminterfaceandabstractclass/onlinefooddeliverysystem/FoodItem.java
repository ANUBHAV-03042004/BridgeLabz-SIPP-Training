package encapsulationpolymorphisminterfaceandabstractclass.onlinefooddeliverysystem;

public abstract class FoodItem {
//	private variables for encapsulation
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: Rs. " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}
