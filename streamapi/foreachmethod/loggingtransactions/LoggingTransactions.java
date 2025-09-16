package foreachmethod.loggingtransactions;
	import java.util.*;
	import java.time.*;

	public class LoggingTransactions {
	    public static void main(String[] args) {
	        List<String> transactionIds = Arrays.asList("TXN123", "TXN456", "TXN789");

	        transactionIds.forEach(id -> 
	            System.out.println(LocalDateTime.now() + " - Transaction: " + id));
	    }
	}

