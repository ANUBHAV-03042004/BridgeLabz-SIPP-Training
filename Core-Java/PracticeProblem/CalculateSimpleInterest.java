
import java.util.Scanner;
public class CalculateSimpleInterest {
	 // Simple Interest
	 public static void calculateSimpleInterest(double principal,double rate,double time) {
	   
	     double si = (principal * rate * time) / 100;
	     System.out.println("Simple Interest: " + si);
	 }
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter Principal: ");
	     double principal = sc.nextDouble();
	     System.out.print("Enter Rate: ");
	     double rate = sc.nextDouble();
	     System.out.print("Enter Time (in years): ");
	     double time = sc.nextDouble();
	      calculateSimpleInterest(principal,rate,time);
}
}