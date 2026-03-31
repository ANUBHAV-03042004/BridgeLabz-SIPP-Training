import java.util.*;
public class RootsOfQuadraticEquation {
//	method to find roots
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { r1, r2 };
        } else if (delta == 0) {
            return new double[] { -b / (2 * a) };
        } else {
            return new double[] {}; // No real roots
        }
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
//    	user's input  a , b and c
    	System.out.println("Enter value of a:");
    	int a=sc.nextInt();
    	System.out.println("Enter value of b:");
    	int b=sc.nextInt();
    	System.out.println("Enter value of c:");
    	int c=sc.nextInt();
        double[] roots = findRoots(a,b,c); 
        System.out.println("Roots: " + Arrays.toString(roots));
    }
}
