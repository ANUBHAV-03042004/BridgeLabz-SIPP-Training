import java.util.Scanner;

public class CollinearityChecker {

    // Method to check if three points are collinear using slope formula
    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Slope AB = (y2 - y1)/(x2 - x1)
        // Slope AC = (y3 - y1)/(x3 - x1)
        // Instead of dividing, cross multiply to avoid division by zero
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method to check if three points are collinear using area of triangle
    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area formula = 0.5 * [ x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2) ]
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take user input for the three points
        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        //  Check using slope method
        boolean collinearBySlope = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Formula: " + collinearBySlope);

        //  Check using area of triangle method
        boolean collinearByArea = isCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Area Formula: " + collinearByArea);

        // Final Result
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points ARE collinear.");
        } else {
            System.out.println("The points are NOT collinear.");
        }
    }
}
