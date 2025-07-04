package encapsulationpolymorphisminterfaceandabstractclass.bankingsystem;


class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double loanAmount;
    private boolean hasActiveLoan;
    
    public SavingsAccount(String accountNumber, String holderName, double initialBalance, String accountPin, double interestRate) {
        super(accountNumber, holderName, initialBalance, accountPin);
        this.interestRate = interestRate;
        this.loanAmount = 0;
        this.hasActiveLoan = false;
    }
    
    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
    public void applyInterest() {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest applied: $" + String.format("%.2f", interest));
    }
    
    @Override
    public boolean applyForLoan(double amount) {
        if (hasActiveLoan) {
            System.out.println("Cannot apply for loan. Active loan exists.");
            return false;
        }
        
        double eligibleAmount = calculateLoanEligibility();
        if (amount <= eligibleAmount) {
            loanAmount = amount;
            hasActiveLoan = true;
            balance += amount; // Add loan amount to balance
            System.out.println("Loan approved: $" + amount);
            return true;
        } else {
            System.out.println("Loan denied. Maximum eligible amount: $" + String.format("%.2f", eligibleAmount));
            return false;
        }
    }
    
    @Override
    public double calculateLoanEligibility() {
        return balance * 2; // Can borrow up to 2x current balance
    }
    
    @Override
    public String getLoanDetails() {
        if (hasActiveLoan) {
            return "Active loan: $" + String.format("%.2f", loanAmount);
        } else {
            return "No active loan";
        }
    }
}
