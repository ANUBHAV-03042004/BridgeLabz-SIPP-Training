package inheritance.heirarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void displayAccountType() {
        System.out.println("\n--- Savings Account ---");
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
