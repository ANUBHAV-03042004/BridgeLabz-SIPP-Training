package bankingportal;

//Base Account class
abstract class Account {
protected String accountNumber;
protected String holderName;
protected double balance;

public Account(String accountNumber, String holderName, double balance) {
this.accountNumber = accountNumber;
this.holderName = holderName;
this.balance = balance;
}

//Common deposit method
public void deposit(double amount) {
balance += amount;
System.out.println("Deposited: " + amount + ", New Balance: " + balance);
}

//Abstract withdraw method (implemented differently by subclasses)
public abstract void withdraw(double amount);

public void display() {
System.out.println("Account No: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
}
}