package paymentgatewayintegration;

interface PaymentProcessor {
    void process(double amount);

    default void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " (default method)");
    }
}