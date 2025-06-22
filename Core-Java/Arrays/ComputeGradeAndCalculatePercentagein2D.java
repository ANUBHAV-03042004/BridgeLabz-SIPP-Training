import java.util.Scanner;

public class ComputeGradeAndCalculatePercentagein2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [student][physics, chemistry, maths]
        double[] percentages = new double[n]; // To store percentage
        char[] grades = new char[n];          // To store grade

        // Step 2: Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = sc.nextInt();

                // Re-enter if negative marks
                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks! Enter again.");
                    j--; // repeat this subject
                }
            }

            // Step 3: Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            // Step 4: Assign grade based on percentage
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        // Step 5: Display all results
        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Physics=%d, Chemistry=%d, Maths=%d, Percentage=%.2f%%, Grade=%c\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
