import java.util.*;
class StudentVoteChecker {
    // Method to check voting eligibility
    public static boolean canStudentVote(int age) {
        if (age < 0) return false; // invalid input
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // Input 10 student ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check eligibility
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + (canStudentVote(ages[i]) ? " CAN vote." : " CANNOT vote."));
        }
        sc.close();
    }
}