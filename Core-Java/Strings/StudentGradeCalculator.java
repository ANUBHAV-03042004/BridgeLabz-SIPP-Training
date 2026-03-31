import java.util.Scanner;

public class StudentGradeCalculator {

    // Method 1: Generate random 2-digit marks for Physics, Chemistry, Math
    public static int[][] generateMarks(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + (int)(Math.random() * 60); // generates random 2-digit marks between 40–99
            }
        }
        return scores;
    }

    // Method 2: Calculate total, average, percentage (rounded to 2 decimals)
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method 3: Assign grade based on percentage
    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];

            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Method 4: Display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nS.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" + (int)results[i][0] + "\t" + results[i][1] + "\t" +
                    results[i][2] + "%\t\t" + grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Step 1: Generate Marks
        int[][] scores = generateMarks(n);

        // Step 2: Compute Total, Average, and Percentage
        double[][] results = calculateResults(scores);

        // Step 3: Assign Grades
        String[] grades = assignGrades(results);

        // Step 4: Display all results
        displayScorecard(scores, results, grades);

        sc.close();
    }
}
