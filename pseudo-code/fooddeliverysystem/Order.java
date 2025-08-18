package fooddeliverysystem;

class Order {
    Customer customer;
    Restaurant restaurant;
    DeliveryBoy deliveryBoy;
    String foodItem;

    Order(Customer customer, Restaurant restaurant, DeliveryBoy deliveryBoy, String foodItem) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.deliveryBoy = deliveryBoy;
        this.foodItem = foodItem;
    }

    void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Customer: " + customer.name + " (" + customer.address + ")");
        System.out.println("Restaurant: " + restaurant.name + " - " + restaurant.cuisine);
        System.out.println("Delivery Boy: " + deliveryBoy.name + " (" + deliveryBoy.phone + ")");
        System.out.println("Food Item: " + foodItem);
    }
}
