import java.util.Scanner;

public class UnitConverterExtended {
	    public static double convertFahrenheitToCelsius(double f) {
	        return (f - 32) * 5 / 9;
	    }
	    public static double convertCelsiusToFahrenheit(double c) {
	        return (c * 9 / 5) + 32;
	    }
	    public static double convertPoundsToKg(double p) {
	        return p * 0.453592;
	    }
	    public static double convertKgToPounds(double kg) {
	        return kg * 2.20462;
	    }
	    public static double convertGallonsToLiters(double g) {
	        return g * 3.78541;
	    }
	    public static double convertLitersToGallons(double l) {
	        return l * 0.264172;
	    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in Fahrenheit: ");
        double num = sc.nextDouble();
        double Celsius=convertFahrenheitToCelsius(num);
        System.out.println("Converted Fahrenheit To Celsius:"+ Celsius);
        double Fahrenheit=convertCelsiusToFahrenheit(Celsius);
        System.out.println("Converted Celsius To Fahrenheit:"+ Fahrenheit);
        System.out.print("Enter number in gallons: ");
        double num2=sc.nextDouble();
        double liters=convertGallonsToLiters(num2);
        System.out.println("Converted Gallons To Liters:"+liters);
        double gallons=convertLitersToGallons(liters);
        System.out.println("Converted Liters To Gallons:"+gallons);
        sc.close();
    }
}
