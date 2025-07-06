package thisstaticfinalkeywordandinstanceofoperator.level1.bankaccountsystem;

public class BankAccountSystem {
    // Static: shared across all instances
    private static String bankName = "MyBank";
    private static int totalAccounts = 0;

    // Final: unique identifier that can't be changed
    private final String accountNumber;

    // Instance fields
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccountSystem(String accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        totalAccounts++;
    }

    // Static method to retrieve total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Static method to retrieve bank name
    public static String getBankName() {
        return bankName;
    }

    // Instance method: deposit money into an account
    public void deposit(double amount) {
        balance += amount;
    }

    // Instance method: withdraw money from an account
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Display account details only if obj is a BankAccount
    public static void displayDetails(Object obj) {
        if (obj instanceof BankAccountSystem) {
            BankAccountSystem acc = (BankAccountSystem) obj;
            System.out.println("Bank: " + bankName);
            System.out.println("Account No: " + acc.accountNumber);
            System.out.println("Holder Name: " + acc.accountHolderName);
            System.out.println("Balance: " + acc.balance);
        } else {
            System.out.println("Provided object is not a BankAccount");
        }
    }
}
