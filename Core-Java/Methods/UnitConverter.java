import java.util.Arrays;
import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
    public static double convertMetersToFeet(double m) {
        return m * 3.28084;
    }
    public static double convertFeetToMeters(double ft) {
        return ft * 0.3048;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in km: ");
        double num = sc.nextDouble();
        double miles=convertKmToMiles(num);
        System.out.println("Converted Km to miles:"+ miles);
        double km=convertMilesToKm(miles);
        System.out.println("Converted Miles to Km:"+ km);
        System.out.print("Enter number in meters: ");
        double num2=sc.nextDouble();
        double feet=convertMetersToFeet(num2);
        System.out.println("Converted meters to feet:"+feet);
        double meters=convertFeetToMeters(feet);
        System.out.println("Converted feet to meters:"+meters);
        sc.close();
    }
}
