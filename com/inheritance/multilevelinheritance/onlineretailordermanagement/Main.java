package inheritance.multilevelinheritance.onlineretailordermanagement;

public class Main {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder("ORD123", "2025-06-20", "TRK456789", "2025-06-22");
        order.displayOrderDetails();
    }
}

