package foreachmethod.iotsensorreadings;

	import java.util.*;
public class IotSensorReadings {
	    public static void main(String[] args) {
	        List<Integer> readings = Arrays.asList(45, 60, 30, 75, 55);

	        readings.stream()
	                .filter(r -> r > 50)
	                .forEach(r -> System.out.println("High Reading: " + r));
	    }
	}
