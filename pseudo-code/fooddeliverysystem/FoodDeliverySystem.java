package fooddeliverysystem;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Customer c = new Customer("Alice", "123 Street");
        Restaurant r = new Restaurant("PizzaHub", "Italian");
        DeliveryBoy d = new DeliveryBoy("Bob", "9876543210");

        Order order = new Order(c, r, d, "Pepperoni Pizza");
        order.printOrderDetails();
    }
}