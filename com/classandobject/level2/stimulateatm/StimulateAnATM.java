package classandobject.level2.stimulateatm;

public class StimulateAnATM {
	    String accountHolder;
	    String accountNumber;
	    double balance;
	    double amount;

	    StimulateAnATM(String accountHolder, String accountNumber, double balance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	        this.amount=amount;
	    }

	    // Method to deposit money
	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited Rs." + amount);
	    }

	    // Method to withdraw money
	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew Rs." + amount);
	        } else {
	            System.out.println("Insufficient Balance!");
	        }
	    }

	    // Method to display balance
	    void displayBalance() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: Rs." + balance);
	    }
	}
