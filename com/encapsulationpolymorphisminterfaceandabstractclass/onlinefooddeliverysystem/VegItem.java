package encapsulationpolymorphisminterfaceandabstractclass.onlinefooddeliverysystem;


public class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg Item.";
    }
}
