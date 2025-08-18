package nameuppercasing;
	// converting employee names to uppercase using method references

	import java.util.*;
	import java.util.stream.Collectors;

	public class NameUpperCasing {
	    public static void main(String[] args) {
	        List<String> employees = Arrays.asList("Anubhav", "Kriti", "Rohit", "Meera");

	        // Convert names to uppercase
	        List<String> upperNames = employees.stream()
	                                           .map(String::toUpperCase) // method reference
	                                           .collect(Collectors.toList());

	        System.out.println("Uppercase Employee Names:");
	        upperNames.forEach(System.out::println);
	    }
	}
