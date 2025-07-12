package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.linearsearch;

public class SearchForTheFirstNegativeNumber {
	    public static int findFirstNegative(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < 0) {
	                return i; // Return the index of first negative number
	            }
	        }
	        return -1; // If no negative number found
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 7, 12, -3, 4, -2};
	        int index = findFirstNegative(arr);
	        
	        if (index != -1) {
	            System.out.println("First negative number found at index: " + index + " (value: " + arr[index] + ")");
	        } else {
	            System.out.println("No negative numbers found in the array.");
	        }
	    }
	}

