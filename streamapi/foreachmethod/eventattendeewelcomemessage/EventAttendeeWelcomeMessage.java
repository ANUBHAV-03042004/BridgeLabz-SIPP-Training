package foreachmethod.eventattendeewelcomemessage;
	import java.util.*;

public class EventAttendeeWelcomeMessage {
	    public static void main(String[] args) {
	        List<String> attendees = Arrays.asList("Alice", "Bob", "Charlie");

	        attendees.forEach(name -> System.out.println("Welcome, " + name + "!"));
	    }
	}
