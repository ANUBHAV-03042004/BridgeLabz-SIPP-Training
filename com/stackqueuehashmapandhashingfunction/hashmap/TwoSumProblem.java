package stackqueuehashmapandhashingfunction.hashmap;
import java.util.*;
public class TwoSumProblem {

	    public static int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>(); // value -> index

	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];

	            if (map.containsKey(complement)) {
	                return new int[]{map.get(complement), i};
	            }

	            map.put(nums[i], i);
	        }

	        return new int[]{-1, -1}; // Not found
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 6, 11, -2};
	        int target = 9;
	        int[] result = twoSum(nums, target);

	        if (result[0] != -1) {
	            System.out.println("Indices: " + Arrays.toString(result));
	        } else {
	            System.out.println("No pair found");
	        }
	    }
	}
