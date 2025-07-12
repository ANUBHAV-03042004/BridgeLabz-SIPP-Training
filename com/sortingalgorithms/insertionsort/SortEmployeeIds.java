package sortingalgorithms.insertionsort;
import java.util.*;
public class SortEmployeeIds {
	  public static void insertionSort(int[] ids) {
	        for (int i = 1; i < ids.length; i++) {
	            int key = ids[i];
	            int j = i - 1;
	            // Move elements greater than key to one position ahead
	            while (j >= 0 && ids[j] > key) {
	                ids[j + 1] = ids[j];
	                j--;
	            }
	            ids[j + 1] = key; // Insert key at correct position
	        }
	    }
	  public static void main(String[] args) {
	   int[] employeeIDs = {105, 101, 109, 103, 102};
       insertionSort(employeeIDs);
       System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
	  }
}