package paymentgatewayintegration;

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        paypal.process(1000);
        paypal.refund(200);
    }
}