package bankingportal;

//Savings Account with minimum balance rule
class SavingsAccount extends Account {
private static final double MIN_BALANCE = 1000;

public SavingsAccount(String accountNumber, String holderName, double balance) {
 super(accountNumber, holderName, balance);
}

@Override
public void withdraw(double amount) {
 if (balance - amount < MIN_BALANCE) {
     System.out.println("❌ Withdrawal denied! Minimum balance should be " + MIN_BALANCE);
 } else {
     balance -= amount;
     System.out.println("✅ Withdrawn: " + amount + ", Remaining Balance: " + balance);
 }
}
}
