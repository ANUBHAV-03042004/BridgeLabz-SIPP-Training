package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.binarysearch;

public class FindThePeakElement {
	    public static int findPeakElement(int[] arr) {
	        int left = 0, right = arr.length - 1;

	        while (left < right) {
	            int mid = (left + right) / 2;

	            if (arr[mid] < arr[mid + 1]) {
	                left = mid + 1; // Peak lies to the right
	            } else {
	                right = mid; // Peak lies to the left or is at mid
	            }
	        }

	        return left; // Index of a peak
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 20, 40,4, 1, 0};
	        int peakIndex = findPeakElement(arr);

	        System.out.println("Peak element found at index: " + peakIndex);
	        System.out.println("Peak element: " + arr[peakIndex]);
	    }
	}

