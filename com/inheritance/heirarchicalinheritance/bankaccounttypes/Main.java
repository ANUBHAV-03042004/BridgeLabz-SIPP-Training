package inheritance.heirarchicalinheritance.bankaccounttypes;

public class Main {
	    public static void main(String[] args) {
	        SavingsAccount sa = new SavingsAccount("SA123", 20000.0, 4.5);
	        CheckingAccount ca = new CheckingAccount("CA456", 15000.0, 10000.0);
	        FixedDepositAccount fda = new FixedDepositAccount("FD789", 50000.0, 12);

	        sa.displayAccountType();
	        ca.displayAccountType();
	        fda.displayAccountType();
	    }
	}