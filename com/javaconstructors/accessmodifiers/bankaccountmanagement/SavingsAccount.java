package javaconstructors.accessmodifiers.bankaccountmanagement;


//Subclass
class SavingsAccount extends BankAccount {
 public SavingsAccount(String accNo, String holder, double bal) {
     super(accNo, holder, bal);
 }

 public void displayAccountInfo() {
     System.out.println("Account No: " + accountNumber);    // Public
     System.out.println("Holder Name: " + accountHolder);   // Protected
     System.out.println("Balance: ₹" + getBalance());       // Private via getter
 }
}
