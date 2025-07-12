package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.binarysearch;

public class FirstAndLastOccurrenceOfAnElement {
    // Find First Occurrence
	    public static int findFirst(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                right = mid - 1;  // Continue to search in left half
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    // Find Last Occurrence
	    public static int findLast(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                left = mid + 1;  // Continue to search in right half
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 4, 3, 4, 2, 4, 10};
	        int target = 10;

	        int first = findFirst(arr, target);
	        int last = findLast(arr, target);

	        System.out.println("First occurrence of " + target + " = " + first);
	        System.out.println("Last occurrence of " + target + " = " + last);
	    }
	}
