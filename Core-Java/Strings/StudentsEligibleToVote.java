import java.util.Random;
import java.util.Scanner;

public class StudentsEligibleToVote {

    // Method to generate random ages for students
    public static int[] generateAges(int count) {
        int[] ages = new int[count];
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            ages[i] = rand.nextInt(40); // Random age between 0 to 39
        }
        return ages;
    }

    // Method to check if students can vote (18 or older)
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display results in a table format
    public static void displayResult(String[][] data) {
        System.out.println("\n--- Voting Eligibility ---");
        System.out.println("Age\tEligibility");
        System.out.println("-------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students (e.g., 10): ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] votingInfo = checkVotingEligibility(ages);
        displayResult(votingInfo);
    }
}
