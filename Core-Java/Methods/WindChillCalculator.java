import java.util.*;
public class WindChillCalculator {
//	method to calculate wind chill
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the temperature:");
        double temp =sc.nextDouble(); 
        System.out.println("Enter the WindSpeed:");
        double windSpeed =sc.nextDouble(); 
        System.out.println("Wind Chill: " + calculateWindChill(temp, windSpeed));
    }
}