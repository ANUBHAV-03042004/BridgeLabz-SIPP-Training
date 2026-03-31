import java.util.Random;
import java.util.Scanner;

public class MatrixOperationsUserRandomInput {

    // Method 1: Create a random matrix with values between 0 and 9
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);  // random value 0–9
        return matrix;
    }

    // Method 2: Add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = A[i][j] + B[i][j];
        return sum;
    }

    // Method 3: Subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                diff[i][j] = A[i][j] - B[i][j];
        return diff;
    }

    // Method 4: Multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int r1 = A.length, c1 = A[0].length, c2 = B[0].length;
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // Utility: Display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for matrix dimensions
        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        //  Create random matrices
        int[][] A = createMatrix(r1, c1);
        int[][] B = createMatrix(r2, c2);

        //  Display matrices
        System.out.println("\nMatrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);

        //  Addition and Subtraction (only if dimensions match)
        if (r1 == r2 && c1 == c2) {
            System.out.println("\nMatrix Addition:");
            displayMatrix(addMatrices(A, B));

            System.out.println("\nMatrix Subtraction:");
            displayMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("\nAddition/Subtraction not possible (dimension mismatch).");
        }

        //  Multiplication (A.columns == B.rows)
        if (c1 == r2) {
            System.out.println("\nMatrix Multiplication (A x B):");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible (A.columns != B.rows).");
        }
    }
}
