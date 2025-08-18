package digitalwallettransactionreport;

import java.time.LocalDate;

class Transaction {
    int id;
    String merchant;
    double amount;
    LocalDate date;

    public Transaction(int id, String merchant, double amount, LocalDate date) {
        this.id = id;
        this.merchant = merchant;
        this.amount = amount;
        this.date = date;
    }

    public String getMerchant() { return merchant; }
    public double getAmount() { return amount; }
    public LocalDate getDate() { return date; }
}
