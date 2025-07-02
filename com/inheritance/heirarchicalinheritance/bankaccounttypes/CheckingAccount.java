package inheritance.heirarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("\n--- Checking Account ---");
        displayAccountInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}
