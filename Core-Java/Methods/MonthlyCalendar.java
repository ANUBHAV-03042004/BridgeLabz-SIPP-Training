import java.util.Scanner;

public class MonthlyCalendar {

    // Method to get month name
    public static String getMonthName(int month) {
        String[] monthNames = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month];
    }

    // Method to check if year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year))
            return 29;
        return days[month];
    }

    // Method to calculate first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (d + x + (31 * m0) / 12) % 7;
        return dayOfWeek;
    }

    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numDays = getDaysInMonth(month, year);
        int startDay = getFirstDayOfMonth(month, year);

        System.out.printf("\n     %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop for indenting the first day
        for (int i = 0; i < startDay; i++)
            System.out.print("    ");  // 4 spaces

        // Second loop to print the calendar days
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0)  // New line after Saturday
                System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter month (1–12): ");
        int month = sc.nextInt();
        System.out.print("Enter year (e.g. 2005): ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}
