package sortingalgorithms.quicksort;
import java.util.*;
public class SortProductPrices {
	  // Quick Sort Functions
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
	 public static void main(String[] args) {
	 // Quick Sort - Sort Product Prices
    double[] productPrices = {89.5, 12.0, 45.0, 99.9, 10.5};
    quickSort(productPrices, 0, productPrices.length - 1);
    System.out.println("Sorted Product Prices: " + Arrays.toString(productPrices));
}
}