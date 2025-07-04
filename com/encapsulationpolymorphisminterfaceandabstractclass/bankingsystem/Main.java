package encapsulationpolymorphisminterfaceandabstractclass.bankingsystem;
import java.util.*;
public class Main {
	    public static void main(String[] args) {
	        System.out.println("=== BANKING SYSTEM DEMONSTRATION ===\n");
	        
	        // Create different types of accounts demonstrating polymorphism
	        List<BankAccount> accounts = new ArrayList<>();
	        
	        // Adding different account types to the same list
	        accounts.add(new SavingsAccount("SAV001", "John Doe", 1000.0, "1234", 3.5));
	        accounts.add(new CurrentAccount("CUR001", "Jane Smith", 2000.0, "5678", 1000.0));
	        accounts.add(new SavingsAccount("SAV002", "Bob Wilson", 5000.0, "9999", 4.0));
	        
	        // Demonstrate polymorphism - same operations work for all account types
	        System.out.println("=== ACCOUNT DETAILS ===");
	        for (BankAccount account : accounts) {
	            System.out.println(account.getAccountDetails());
	        }
	        
	        System.out.println("\n=== INTEREST CALCULATIONS ===");
	        double totalInterest = 0;
	        for (BankAccount account : accounts) {
	            // Polymorphism - calculateInterest() behaves differently for each account type
	            double interest = account.calculateInterest();
	            System.out.println(account.getAccountNumber() + " - Interest: $" + String.format("%.2f", interest));
	            totalInterest += interest;
	        }
	        System.out.println("Total Interest: $" + String.format("%.2f", totalInterest));
	        
	        // Demonstrate account operations
	        System.out.println("\n=== ACCOUNT OPERATIONS ===");
	        BankAccount savingsAccount = accounts.get(0);
	        BankAccount currentAccount = accounts.get(1);
	        
	        // Deposit operations
	        savingsAccount.deposit(500);
	        currentAccount.deposit(1000);
	        
	        // Withdrawal operations
	        savingsAccount.withdraw(200);
	        currentAccount.withdraw(3500); // This will use overdraft
	        
	        // Demonstrate loan functionality
	        System.out.println("\n=== LOAN OPERATIONS ===");
	        processLoanApplications(accounts);
	        
	        // Demonstrate encapsulation - PIN verification
	        System.out.println("\n=== SECURITY DEMONSTRATION ===");
	        demonstrateSecurity(savingsAccount);
	        
	        // Final account status
	        System.out.println("\n=== FINAL ACCOUNT STATUS ===");
	        for (BankAccount account : accounts) {
	            System.out.println(account.getAccountDetails());
	            if (account instanceof Loanable) {
	                Loanable loanableAccount = (Loanable) account;
	                System.out.println("Loan Status: " + loanableAccount.getLoanDetails());
	            }
	            System.out.println("-".repeat(50));
	        }
	    }
	    private static void processLoanApplications(List<BankAccount> accounts) {
	        for (BankAccount account : accounts) {
	            if (account instanceof Loanable) {
	                Loanable loanableAccount = (Loanable) account;
	                
	                System.out.println("Processing loan for: " + account.getAccountNumber());
	                double eligibility = loanableAccount.calculateLoanEligibility();
	                System.out.println("Loan eligibility: $" + String.format("%.2f", eligibility));
	                
	                // Apply for loan (different amounts for demonstration)
	                if (account instanceof SavingsAccount) {
	                    loanableAccount.applyForLoan(1000);
	                } else if (account instanceof CurrentAccount) {
	                    loanableAccount.applyForLoan(5000);
	                }
	                System.out.println();
	            }
	        }
	    }
	    
	    private static void demonstrateSecurity(BankAccount account) {
	        System.out.println("Testing security for account: " + account.getAccountNumber());
	        
	        // Correct PIN
	        if (account.verifyPin("1234")) {
	            System.out.println("PIN verification successful");
	        }
	        
	        // Incorrect PIN
	        if (!account.verifyPin("0000")) {
	            System.out.println("PIN verification failed - access denied");
	        }
	        
	        // Change PIN
	        account.changePin("1234", "4321");
	        
	        // Verify new PIN
	        if (account.verifyPin("4321")) {
	            System.out.println("New PIN verification successful");
	        }
	    }
	}
