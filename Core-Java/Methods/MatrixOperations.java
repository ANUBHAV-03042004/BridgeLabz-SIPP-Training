import java.util.*;

public class MatrixOperations {
 // Method to display a matrix
 public static void displayMatrix(double[][] matrix) {
     for (double[] row : matrix) {
         for (double value : row) {
             System.out.printf("%8.2f", value);
         }
         System.out.println();
     }
 }

 // Method to transpose a matrix
 public static double[][] transpose(double[][] matrix) {
     int rows = matrix.length, cols = matrix[0].length;
     double[][] transposed = new double[cols][rows];
     for (int i = 0; i < rows; i++)
         for (int j = 0; j < cols; j++)
             transposed[j][i] = matrix[i][j];
     return transposed;
 }

 // Method to calculate determinant of 2x2 matrix
 public static double determinant2x2(double[][] matrix) {
     return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
 }

 // Method to calculate determinant of 3x3 matrix
 public static double determinant3x3(double[][] m) {
     return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
          - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
          + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
 }

 // Method to find inverse of 2x2 matrix
 public static double[][] inverse2x2(double[][] m) {
     double det = determinant2x2(m);
     if (det == 0) return null; // Non-invertible
     double[][] inv = {
         { m[1][1]/det, -m[0][1]/det },
         { -m[1][0]/det, m[0][0]/det }
     };
     return inv;
 }

 // Method to find inverse of 3x3 matrix using adjoint and determinant
 public static double[][] inverse3x3(double[][] m) {
     double det = determinant3x3(m);
     if (det == 0) return null; // Non-invertible

     double[][] cofactor = new double[3][3];
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             double[][] minor = new double[2][2];
             int row = 0;
             for (int r = 0; r < 3; r++) {
                 if (r == i) continue;
                 int col = 0;
                 for (int c = 0; c < 3; c++) {
                     if (c == j) continue;
                     minor[row][col++] = m[r][c];
                 }
                 row++;
             }
             cofactor[i][j] = Math.pow(-1, i+j) * determinant2x2(minor);
         }
     }
     double[][] adjoint = transpose(cofactor);
     double[][] inverse = new double[3][3];
     for (int i = 0; i < 3; i++)
         for (int j = 0; j < 3; j++)
             inverse[i][j] = adjoint[i][j] / det;
     return inverse;
 }

 public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    // Ask matrix size
	    System.out.print("Enter matrix size (2 or 3): ");
	    int size = sc.nextInt();

	    if (size != 2 && size != 3) {
	        System.out.println("Only 2x2 or 3x3 matrices supported.");
	        return;
	    }

	    double[][] matrix = new double[size][size];

	    // Input matrix elements
	    System.out.println("Enter matrix elements row-wise:");
	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size; j++) {
	            System.out.printf("Enter element [%d][%d]: ", i, j);
	            matrix[i][j] = sc.nextDouble();
	        }
	    }

	    System.out.println("\nOriginal Matrix:");
	    displayMatrix(matrix);

	    System.out.println("\nTranspose:");
	    displayMatrix(transpose(matrix));

	    if (size == 2) {
	        double det = determinant2x2(matrix);
	        System.out.println("\nDeterminant: " + det);

	        double[][] inv = inverse2x2(matrix);
	        if (inv != null) {
	            System.out.println("\nInverse:");
	            displayMatrix(inv);
	        } else {
	            System.out.println("\nMatrix is not invertible (det = 0).");
	        }
	    } else if (size == 3) {
	        double det = determinant3x3(matrix);
	        System.out.println("\nDeterminant: " + det);

	        double[][] inv = inverse3x3(matrix);
	        if (inv != null) {
	            System.out.println("\nInverse:");
	            displayMatrix(inv);
	        } else {
	            System.out.println("\nMatrix is not invertible (det = 0).");
	        }
	    }
	}

}
