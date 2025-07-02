package inheritance.heirarchicalinheritance.bankaccounttypes;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to display basic account info
    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
