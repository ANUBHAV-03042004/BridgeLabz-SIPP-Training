package stackqueuehashmapandhashingfunction.hashmap.hashset;
import java.util.*;
public class CheckForPairWithGivenSumInArray {

	    public static boolean hasPairWithSum(int[] arr, int target) {
	        Set<Integer> set = new HashSet<>();

	        for (int num : arr) {
	            if (set.contains(target - num)) {
	                System.out.println("Pair: (" + num + ", " + (target - num) + ")");
	                return true;
	            }
	            set.add(num);
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        int[] arr = {8, 4, 1, 6};
	        int target = 10;
	        if (!hasPairWithSum(arr, target)) {
	            System.out.println("No pair found");
	        }
	    }
	}
