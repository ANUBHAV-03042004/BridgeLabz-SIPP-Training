package digitalpaymentinterface;

class Wallet implements Payment {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Wallet"); }
}

