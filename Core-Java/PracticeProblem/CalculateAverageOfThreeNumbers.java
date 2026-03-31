import java.util.*;
public class CalculateAverageOfThreeNumbers {
	 // Average of Three Numbers
	 public static void averageOfThree(double a , double b, double c) {
	     double average = (a + b + c) / 3;
	     System.out.println("Average: " + average);
	 }
		public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
		     System.out.print("Enter first number: ");
		     double a = sc.nextDouble();
		     System.out.print("Enter second number: ");
		     double b = sc.nextDouble();
		     System.out.print("Enter third number: ");
		     double c = sc.nextDouble();
		      averageOfThree(a,b,c);
	}
}

	
