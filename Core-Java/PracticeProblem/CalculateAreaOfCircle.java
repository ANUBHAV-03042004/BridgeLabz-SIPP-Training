
import java.util.Scanner;
public class CalculateAreaOfCircle {
	 //  Area of Circle
	 public static void areaOfCircle(double radius) {
	    
	     double area = Math.PI * radius * radius;
	     System.out.println("Area of circle: " + area);
	 }
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter radius of circle: ");
	     double radius = sc.nextDouble();
	     areaOfCircle(radius);
	 }
}
	 



	

	