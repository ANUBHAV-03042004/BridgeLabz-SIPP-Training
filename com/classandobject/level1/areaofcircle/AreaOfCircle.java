package classandobject.level1.areaofcircle;
import java.util.*;
public class AreaOfCircle {
		double radius;
			AreaOfCircle (double radius){
				this.radius=radius;
			}
			public void CalculateAreaDisplayResult()
			{
				System.out.println("Area of circle: "+Math.PI*(radius*radius));
			}
			public void CalculateCircumferenceDisplayResult(){
				System.out.println("Circumference of circle: "+2*Math.PI*radius);
			}
}
