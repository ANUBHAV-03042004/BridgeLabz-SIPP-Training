package inheritance.multilevelinheritance.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Getter
    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }

    // Display full order summary
    public void displayOrderDetails() {
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Order Date: " + getOrderDate());
        System.out.println("Tracking No: " + getTrackingNumber());
        System.out.println("Delivery Date: " + getDeliveryDate());
        System.out.println("Status: " + getOrderStatus());
    }
}
