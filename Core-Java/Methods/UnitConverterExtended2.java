import java.util.Scanner;

public class UnitConverterExtended2 {
//	method to convert Yards To Feet
	 public static double convertYardsToFeet(double yards) {
	        return yards * 3;
	    }
//		method to convert Feet To Yards
	    public static double convertFeetToYards(double feet) {
	        return feet * 0.333333;
	    }
//		method to convert Meters To Inches
	    public static double convertMetersToInches(double meters) {
	        return meters * 39.3701;
	    }
//		method to convert Inches To Meters
	    public static double convertInchesToMeters(double inches) {
	        return inches * 0.0254;
	    }
//		method to convert Inches To Cm
	    public static double convertInchesToCm(double inches) {
	        return inches * 2.54;
	    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in Yards: ");
        double num = sc.nextDouble();
        double Feet=convertYardsToFeet(num);
        System.out.println("Converted Yards To Feet:"+ Feet);
        double Yards=convertFeetToYards(Feet);
        System.out.println("Converted Feet To Yards:"+ Yards);
        System.out.print("Enter number in Meters: ");
        double num2=sc.nextDouble();
        double Inches=convertMetersToInches(num2);
        System.out.println("Converted Meters To Inches:"+Inches);
        double Meters=convertInchesToMeters(Inches);
        System.out.println("Converted Inches To Meters:"+Meters);
        double cm=convertInchesToCm(Inches);
        System.out.println("Converted Inches To Cm:"+cm);
        sc.close();
    }
}
