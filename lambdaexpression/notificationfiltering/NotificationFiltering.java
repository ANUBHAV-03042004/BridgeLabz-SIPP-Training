package notificationfiltering;

	import java.util.*;
	import java.util.function.Predicate;

public class NotificationFiltering {
	    public static void main(String[] args) {
	        List<String> alerts = Arrays.asList(
	            "High Blood Pressure",
	            "Normal Checkup",
	            "Critical Heart Alert",
	            "Low Sugar Alert"
	        );

	        // Predicate for filtering only critical alerts
	        Predicate<String> criticalFilter = alert -> alert.contains("Critical");

	        System.out.println("Filtered Critical Alerts:");
	        alerts.stream()
	              .filter(criticalFilter)
	              .forEach(System.out::println);
	    }
	}
