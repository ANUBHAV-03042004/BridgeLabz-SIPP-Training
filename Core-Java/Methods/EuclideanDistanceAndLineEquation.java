import java.util.Scanner;
public class EuclideanDistanceAndLineEquation {

    //  Method to find the Euclidean distance between two points
    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    //  Method to find slope (m) and y-intercept (b) of the line
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);        // slope m = (y2 - y1) / (x2 - x1)
        double b = y1 - m * x1;                          // y-intercept b = y1 - m * x1
        return new double[]{m, b};                       // return [slope, y-intercept]
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Input two points
        System.out.println("Enter coordinates for first point (x1 y1): ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.println("Enter coordinates for second point (x2 y2): ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        // Calculate distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f\n", distance);

        //Find line equation
        if (x1 == x2) {
            System.out.println("The line is vertical, equation: x = " + x1);
        } else {
            double[] result = findLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", result[0], result[1]);
        }
    }
}
