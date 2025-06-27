import java.util.*;

public class StudentScorecard {

    // Method to generate random 2-digit scores for PCM for all students
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // Columns: Physics, Chemistry, Math
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + rand.nextInt(61); // Random score from 40 to 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nS.No\tPhysics\tChemistry\tMath\tTotal\tAverage\t% Percentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%d\t%.2f\t\t%.2f\n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2],
                (int) results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);
        sc.close();
    }
}