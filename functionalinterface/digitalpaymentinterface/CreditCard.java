package digitalpaymentinterface;

class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Credit Card"); }
}
