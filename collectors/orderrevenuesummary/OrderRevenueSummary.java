package orderrevenuesummary;

	import java.util.*;
	import java.util.stream.*;

	public class OrderRevenueSummary {
	    public static void main(String[] args) {
	        List<Order> orders = Arrays.asList(
	            new Order("Alice", 200.5),
	            new Order("Bob", 150.0),
	            new Order("Alice", 300.0),
	            new Order("Charlie", 500.0)
	        );

	        Map<String, Double> revenue = orders.stream()
	            .collect(Collectors.groupingBy(
	                o -> o.customer, 
	                Collectors.summingDouble(o -> o.amount)
	            ));

	        revenue.forEach((cust, total) -> 
	            System.out.println(cust + " -> Total Revenue: " + total));
	    }
	}
