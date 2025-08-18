package banktransactionsystem;

class InsufficientBalanceException extends Exception {
	 public InsufficientBalanceException(String msg) {
	     super(msg);
	 }
	}