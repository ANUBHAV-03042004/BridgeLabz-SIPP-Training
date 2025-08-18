package invoiceobjectcreation;

// constructor reference to create invoice objects

import java.util.*;
import java.util.stream.Collectors;

public class InvoiceObjectCreation{
 public static void main(String[] args) {
     List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

     // Constructor reference
     List<Invoice> invoices = transactionIds.stream()
                                            .map(Invoice::new)
                                            .collect(Collectors.toList());

     invoices.forEach(System.out::println);
 }
}
