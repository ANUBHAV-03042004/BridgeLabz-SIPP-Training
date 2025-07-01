
import java.util.Scanner;
public class PerimeterOfARectangle {
	// Perimeter of Rectangle
	public static void perimeterOfRectangle(double length,double width) {
	    double perimeter = 2 * (length + width);
	    System.out.println("Perimeter of rectangle: " + perimeter);
	}
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter length: ");
		    double length = sc.nextDouble();
		    System.out.print("Enter width: ");
		    double width = sc.nextDouble();
		     perimeterOfRectangle(length,width);
}
}
