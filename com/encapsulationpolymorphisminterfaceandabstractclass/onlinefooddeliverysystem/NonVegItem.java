package encapsulationpolymorphisminterfaceandabstractclass.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 50; // ₹50 extra non-veg handling fee
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Non-Veg Item + ₹50 non-veg fee.";
    }
}
