package classandobject.level1.areaofcircle;

import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of the circle:");
		double radius=sc.nextDouble();
		AreaOfCircle areaofcircle=new AreaOfCircle(radius);
		areaofcircle.CalculateAreaDisplayResult();
		areaofcircle.CalculateCircumferenceDisplayResult();
		sc.close();
	}
}