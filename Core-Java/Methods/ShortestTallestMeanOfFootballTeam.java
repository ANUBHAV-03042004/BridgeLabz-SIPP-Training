import java.util.*;

public class ShortestTallestMeanOfFootballTeam {
    // Method to input player heights
    public static int[] inputHeights(Scanner sc) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + " (in cm): ");
            heights[i] = sc.nextInt();
        }
        return heights;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int h : arr) min = Math.min(min, h);
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int h : arr) max = Math.max(max, h);
        return max;
    }

    public static double findMean(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum / 11.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = inputHeights(sc);
        System.out.println("Shortest Height: " + findMin(heights));
        System.out.println("Tallest Height: " + findMax(heights));
        System.out.println("Mean Height: " + findMean(heights));
        sc.close();
    }
}
