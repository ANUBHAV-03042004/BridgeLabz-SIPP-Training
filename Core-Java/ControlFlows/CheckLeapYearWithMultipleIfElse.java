import java.util.Scanner;

public class CheckLeapYearWithMultipleIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check for valid Gregorian year
        if (year < 1582) {
            System.out.println("Invalid input. Year must be >= 1582.");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
