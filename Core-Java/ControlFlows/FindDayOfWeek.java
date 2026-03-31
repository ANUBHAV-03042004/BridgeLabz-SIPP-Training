public class FindDayOfWeek {
    public static void main(String[] args) {
        // 1. Take month, day, year from command-line arguments
        int m = Integer.parseInt(args[0]); // month (1 = Jan, ..., 12 = Dec)
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // 2. Apply formula step-by-step (all use integer division)
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // 3. Print result (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.println("Day of the week (0=Sun...6=Sat): " + d0);
    }
}
