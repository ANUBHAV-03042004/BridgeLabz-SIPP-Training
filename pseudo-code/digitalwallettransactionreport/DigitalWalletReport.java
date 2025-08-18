package digitalwallettransactionreport;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class DigitalWalletReport {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(1, "Amazon", 1200, LocalDate.of(2025, 1, 15)),
            new Transaction(2, "Flipkart", 800, LocalDate.of(2025, 1, 20)),
            new Transaction(3, "Amazon", 500, LocalDate.of(2025, 2, 10)),
            new Transaction(4, "Zomato", 300, LocalDate.of(2025, 2, 12)),
            new Transaction(5, "Amazon", 1000, LocalDate.of(2025, 1, 25))
        );

        // Group by Merchant + Month
        Map<String, Map<String, Double>> report =
            transactions.stream()
                .collect(Collectors.groupingBy(
                    Transaction::getMerchant,
                    Collectors.groupingBy(
                        t -> t.getDate().getMonth().toString(),
                        Collectors.summingDouble(Transaction::getAmount)
                    )
                ));

        // Print report
        report.forEach((merchant, monthMap) -> {
            System.out.println("Merchant: " + merchant);
            monthMap.forEach((month, total) -> {
                System.out.println("   " + month + " → " + total);
            });
        });
    }
}
