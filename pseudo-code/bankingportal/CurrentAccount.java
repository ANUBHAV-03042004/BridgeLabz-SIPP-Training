package bankingportal;

//Current Account with overdraft facility
class CurrentAccount extends Account {
private static final double OVERDRAFT_LIMIT = -5000;

public CurrentAccount(String accountNumber, String holderName, double balance) {
   super(accountNumber, holderName, balance);
}

@Override
public void withdraw(double amount) {
   if (balance - amount < OVERDRAFT_LIMIT) {
       System.out.println("❌ Withdrawal denied! Overdraft limit exceeded.");
   } else {
       balance -= amount;
       System.out.println("✅ Withdrawn: " + amount + ", Remaining Balance: " + balance);
   }
}
}