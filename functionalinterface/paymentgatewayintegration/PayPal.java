package paymentgatewayintegration;

class PayPal implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processed ₹" + amount + " via PayPal");
    }
}