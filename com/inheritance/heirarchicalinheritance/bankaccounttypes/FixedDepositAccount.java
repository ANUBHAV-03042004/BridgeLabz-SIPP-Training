package inheritance.heirarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    private int durationInMonths;

    public FixedDepositAccount(String accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void displayAccountType() {
        System.out.println("\n--- Fixed Deposit Account ---");
        displayAccountInfo();
        System.out.println("Duration: " + durationInMonths + " months");
    }
}
