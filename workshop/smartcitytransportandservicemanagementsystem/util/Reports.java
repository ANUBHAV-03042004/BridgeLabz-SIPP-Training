package smartcitytransportandservicemanagementsystem.util;


import smartcitytransportandservicemanagementsystem.model.Passenger;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Reports {
    public static void revenueAndUsageReports(List<Passenger> passengers) {
        System.out.println("\n--- Revenue & Usage Reports ---");

        Map<String, Double> revenueByRoute = passengers.stream()
            .collect(groupingBy(p -> p.route.id, summingDouble(p -> p.paidFare)));

        Map<String, Long> usageByRoute = passengers.stream()
            .collect(groupingBy(p -> p.route.id, counting()));

        System.out.println("Revenue by route:");
        revenueByRoute.forEach((r, rev) -> System.out.println("  " + r + " -> ₹" + rev));

        System.out.println("Usage by route:");
        usageByRoute.forEach((r, c) -> System.out.println("  " + r + " -> " + c + " trips"));

        DoubleSummaryStatistics stats = passengers.stream()
            .collect(summarizingDouble(p -> p.paidFare));

        System.out.println("Fare stats: count=" + stats.getCount() + 
                           " avg=" + stats.getAverage() + 
                           " total=" + stats.getSum());
    }
}
