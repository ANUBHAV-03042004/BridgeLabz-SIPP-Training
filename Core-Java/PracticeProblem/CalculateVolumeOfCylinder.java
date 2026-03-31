
import java.util.Scanner;
public class CalculateVolumeOfCylinder {
	 // Volume of Cylinder
	 public static void volumeOfCylinder(double radius , double height) {
	     double volume = Math.PI * radius * radius * height;
	     System.out.println("Volume of cylinder: " + volume);
	 }

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter radius of cylinder: ");
	     double radius = sc.nextDouble();
	     System.out.print("Enter height of cylinder: ");
	     double height = sc.nextDouble();
	      volumeOfCylinder(radius,height);
	}
}

	

