import java.util.*;
public class ConvertKilometersToMiles {
	 // Convert Kilometers to Miles
	 public static void kilometersToMiles(double km) {
	     double miles = km * 0.621371;
	     System.out.println("Distance in miles: " + miles);
	 }
	 // Main method to test the function
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter distance in kilometers: ");
	     double km = sc.nextDouble();
	      kilometersToMiles(km);
	     sc.close();
	 }
}
