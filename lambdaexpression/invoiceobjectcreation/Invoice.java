package invoiceobjectcreation;

class Invoice {
	 int transactionId;

	 Invoice(int transactionId) {
	     this.transactionId = transactionId;
	 }

	 @Override
	 public String toString() {
	     return "Invoice created for Transaction ID: " + transactionId;
	 }
	}
