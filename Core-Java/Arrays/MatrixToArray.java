import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];
        int index = 0;

        // Input 2D matrix values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                flat[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        System.out.print("Flattened Array: ");
        for (int val : flat) {
            System.out.print(val + " ");
        }
    }
}
