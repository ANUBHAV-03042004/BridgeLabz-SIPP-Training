import java.util.Scanner;

public class SpringSeasonCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        // Check if the date falls within Spring (March 20 to June 20)
        boolean isSpring = (month == 3 && day >= 20) ||
                           (month == 4) ||
                           (month == 5) ||
                           (month == 6 && day <= 20);

        // Display result
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }
}
