package junit.bankaccounttransaction;

//BankAccount.java
public class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 // Withdraw money (throws exception if insufficient funds)
 public void withdraw(double amount) {
     if (amount > balance) {
         throw new IllegalArgumentException("Insufficient funds!");
     }
     balance -= amount;
 }

 // Get balance
 public double getBalance() {
     return balance;
 }
}

