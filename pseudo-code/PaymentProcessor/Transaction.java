package PaymentProcessor;

class Transaction<T> {
    private T paymentMethod;

    Transaction(T paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    void process() {
        System.out.println("Processing transaction using: " + paymentMethod);
    }
}