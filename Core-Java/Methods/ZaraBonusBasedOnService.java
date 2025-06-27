import java.util.*;
public class ZaraBonusBasedOnService {

    // Method 1: Generate random salary (5-digit) and years of service for 10 employees
    public static int[][] generateSalaryAndService(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = rand.nextInt(11);            // 0–10 years of service
        }
        return data;
    }

    // Method 2: Calculate bonus (5% if service > 5 yrs, else 2%) and new salary
    public static double[][] calculateNewSalaryAndBonus(int[][] oldData) {
        int n = oldData.length;
        double[][] newData = new double[n][2];

        for (int i = 0; i < n; i++) {
            int salary = oldData[i][0];
            int service = oldData[i][1];
            double bonus;

            if (service > 5)
                bonus = 0.05 * salary;
            else
                bonus = 0.02 * salary;

            double newSalary = salary + bonus;
            newData[i][0] = Math.round(newSalary * 100.0) / 100.0;
            newData[i][1] = Math.round(bonus * 100.0) / 100.0;
        }
        return newData;
    }

    // Method 3: Calculate total old salary, new salary, and total bonus
    public static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOldSalary\tService\tNewSalary\tBonus");
        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int service = oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];

            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n", i + 1, oldSalary, service, newSalary, bonus);
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f\n", totalOld);
        System.out.printf("Total New Salary: %.2f\n", totalNew);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
    }

    // Main method
    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] oldData = generateSalaryAndService(numEmployees); // Step 1
        double[][] newData = calculateNewSalaryAndBonus(oldData); // Step 2
        displaySummary(oldData, newData);                         // Step 3
    }
}
