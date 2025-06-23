import java.util.*;
public class RootsOfQuadraticEquation {
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
        double[] roots = findRoots(1, -3, 2); // Example
        System.out.println("Roots: " + Arrays.toString(roots));
    }
}
