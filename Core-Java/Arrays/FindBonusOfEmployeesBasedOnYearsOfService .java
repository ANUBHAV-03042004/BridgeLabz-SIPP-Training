import java.util.Scanner;

public class FindBonusOfEmployeesBasedOnYearsOfService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 10;

        double[] salary = new double[count];
        double[] years = new double[count];
        double[] bonus = new double[count];
        double[] newSalary = new double[count];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salary and years
        for (int i = 0; i < count; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();

            // Bonus calculation
            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            // Totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.printf("Total Bonus Paid: ₹%.2f\n", totalBonus);
        System.out.printf("Total Old Salary: ₹%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: ₹%.2f\n", totalNewSalary);
    }
}
