package encapsulationpolymorphisminterfaceandabstractclass.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    private double loanAmount;
    private boolean hasActiveLoan;
    
    public CurrentAccount(String accountNumber, String holderName, double initialBalance, String accountPin, double overdraftLimit) {
        super(accountNumber, holderName, initialBalance, accountPin);
        this.overdraftLimit = overdraftLimit;
        this.loanAmount = 0;
        this.hasActiveLoan = false;
    }
    
    @Override
    public double calculateInterest() {
        return balance * 0.5 / 100; // 0.5% interest rate
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + String.format("%.2f", balance));
            if (balance < 0) {
                System.out.println("Using overdraft facility. Available overdraft: $" + String.format("%.2f", overdraftLimit + balance));
            }
            return true;
        } else if (amount > (balance + overdraftLimit)) {
            System.out.println("Insufficient funds including overdraft. Available: $" + String.format("%.2f", balance + overdraftLimit));
            return false;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
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
            balance += amount;
            System.out.println("Business loan approved: $" + amount);
            return true;
        } else {
            System.out.println("Loan denied. Maximum eligible amount: $" + String.format("%.2f", eligibleAmount));
            return false;
        }
    }
    @Override
    public double calculateLoanEligibility() {
        return (balance + overdraftLimit) * 3; // Can borrow up to 3x available funds
    }
    
    @Override
    public String getLoanDetails() {
        if (hasActiveLoan) {
            return "Active business loan: $" + String.format("%.2f", loanAmount);
        } else {
            return "No active loan";
        }
    }
}