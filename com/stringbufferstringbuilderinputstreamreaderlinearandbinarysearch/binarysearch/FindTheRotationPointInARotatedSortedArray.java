package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.binarysearch;

public class FindTheRotationPointInARotatedSortedArray {
	    public static int findRotationPoint(int[] arr) {
	        int left = 0, right = arr.length - 1;

	        while (left < right) {
	            int mid = (left + right) / 2;

	            if (arr[mid] > arr[right]) {
	                left = mid + 1; // Smallest in the right half
	            } else {
	                right = mid; // Smallest could be at mid or in left half
	            }
	        }

	        return left; // Index of smallest element
	    }

	    public static void main(String[] args) {
	        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
	        int rotationIndex = findRotationPoint(rotatedArray);

	        System.out.println("Rotation point (smallest element index): " + rotationIndex);
	        System.out.println("Smallest element: " + rotatedArray[rotationIndex]);
	    }
	}

