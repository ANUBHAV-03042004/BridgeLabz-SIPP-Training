package accessmodifiers.bankaccountmanagement;


class BankAccount {
    public String accountNumber;         // Public
    protected String accountHolder;      // Protected
    private double balance;              // Private

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter/setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

