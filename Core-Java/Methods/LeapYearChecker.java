import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if year is a leap year
    public static boolean isLeapYear(int year) {
        return year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582)
            System.out.println("Year must be 1582 or later.");
        else
            System.out.println(year + (isLeapYear(year) ? " is a Leap Year" : " is NOT a Leap Year"));

        sc.close();
    }
}
