package encapsulationpolymorphisminterfaceandabstractclass.bankingsystem;
abstract class BankAccount {
    // Protected fields for encapsulation - accessible to subclasses
    protected String accountNumber;
    protected String holderName;
    protected double balance;
    
    // Private field for additional security - only accessible within this class
    private String accountPin;
    
    // Constructor
    public BankAccount(String accountNumber, String holderName, double initialBalance, String accountPin) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.accountPin = accountPin;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + String.format("%.2f", balance));
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + String.format("%.2f", balance));
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Available balance: $" + String.format("%.2f", balance));
            return false;
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
            return false;
        }
    }
    public abstract double calculateInterest();
    public boolean verifyPin(String inputPin) {
        return this.accountPin.equals(inputPin);
    }
    public boolean changePin(String oldPin, String newPin) {
        if (verifyPin(oldPin)) {
            this.accountPin = newPin;
            System.out.println("PIN changed successfully.");
            return true;
        } else {
            System.out.println("Invalid old PIN. PIN change failed.");
            return false;
        }
    }
    
    // Getter methods for encapsulation
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    
    public String getAccountDetails() {
        return "Account: " + accountNumber + ", Holder: " + holderName + ", Balance: $" + String.format("%.2f", balance);
    }
}