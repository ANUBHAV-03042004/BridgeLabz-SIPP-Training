package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.linearbinarychallenge;
import java.util.*;
public class FirstMissingPositiveInLinearAndSearchElementInBinary {
	    // Part 1: Find first missing positive integer
	    public static int findFirstMissingPositive(int[] arr) {
	        Set<Integer> set = new HashSet<>();

	        for (int num : arr) {
	            if (num > 0) {
	                set.add(num);
	            }
	        }

	        int i = 1;
	        while (true) {
	            if (!set.contains(i)) {
	                return i;
	            }
	            i++;
	        }
	    }

	    // Part 2: Binary Search for target
	    public static int binarySearch(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1; // Not found
	    }

	    public static void main(String[] args) {
	        int[] arr = {3, 4, -1, 1};
	        int target = 4;

	        // First Missing Positive
	        int missing = findFirstMissingPositive(arr);
	        System.out.println("First Missing Positive = " + missing);

	        // Sort array before binary search
	        Arrays.sort(arr);
	        System.out.println("Sorted Array: " + Arrays.toString(arr));

	        // Binary Search
	        int index = binarySearch(arr, target);
	        System.out.println("Index of " + target + " = " + index);
	    }
	}

