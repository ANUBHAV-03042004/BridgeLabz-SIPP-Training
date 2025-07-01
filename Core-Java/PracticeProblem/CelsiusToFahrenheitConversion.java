
import java.util.Scanner;
public class CelsiusToFahrenheitConversion {
	 // Celsius to Fahrenheit
	 public static void celsiusToFahrenheit(double celsius) {
	     double fahrenheit = (celsius * 9 / 5) + 32;
	     System.out.println("Temperature in Fahrenheit: " + fahrenheit);
	 }
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter temperature in Celsius: ");
	     double celsius = sc.nextDouble();
	      celsiusToFahrenheit(celsius);
}
	}