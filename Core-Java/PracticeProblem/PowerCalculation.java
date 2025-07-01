import java.util.*;
public class PowerCalculation {
	 // Power Calculation
	 public static void powerCalculation(double base,double exponent) {
	     double result = Math.pow(base, exponent);
	     System.out.println("Result: " + result);
	 }
		public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
		     System.out.print("Enter base: ");
		     double base = sc.nextDouble();
		     System.out.print("Enter exponent: ");
		     double exponent = sc.nextDouble();
		      powerCalculation(base,exponent);
	}
	}