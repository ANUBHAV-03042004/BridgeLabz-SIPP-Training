package sortingalgorithms.countingsort;
import java.util.*;
public class SortStudentAges {
	   // Counting Sort
    public static int[] countingSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];
        for (int age : arr) count[age - min]++;
        int[] sorted = new int[arr.length];
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) sorted[index++] = i + min;
        }
        return sorted;
    }
    public static void main(String[] args) {
    	// Counting Sort - Sort Student Ages
        int[] studentAges = {15, 12, 10, 18, 13, 12, 11};
        int[] sortedAges = countingSort(studentAges, 10, 18);
        System.out.println("Sorted Student Ages: " + Arrays.toString(sortedAges));
    }
}
