import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check valid Gregorian year
        if (year >= 1582) {
            // 2. Leap year logic with single if
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Invalid input. Year must be >= 1582.");
        }
    }
}
