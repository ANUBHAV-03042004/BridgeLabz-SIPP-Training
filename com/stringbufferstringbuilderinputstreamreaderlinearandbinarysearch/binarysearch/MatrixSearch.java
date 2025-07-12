package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.binarysearch;

public class MatrixSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int row = mid / cols;
            int col = mid % cols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target1 = 16;
        int target2 = 13;

        System.out.println("Is 16 in the matrix? " + searchMatrix(matrix, target1)); // true
        System.out.println("Is 13 in the matrix? " + searchMatrix(matrix, target2)); // false
    }
}
