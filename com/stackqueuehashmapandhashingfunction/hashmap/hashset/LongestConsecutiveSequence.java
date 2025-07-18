package stackqueuehashmapandhashingfunction.hashmap.hashset;
import java.util.*;
public class LongestConsecutiveSequence {

	    public static int longestConsecutive(int[] nums) {
	        Set<Integer> set = new HashSet<>();
	        for (int num : nums) set.add(num);

	        int longest = 0;

	        for (int num : nums) {
	            if (!set.contains(num - 1)) { // Start of a sequence
	                int currentNum = num;
	                int streak = 1;

	                while (set.contains(currentNum + 1)) {
	                    currentNum++;
	                    streak++;
	                }

	                longest = Math.max(longest, streak);
	            } 
	        }

	        return longest;
	    }

	    public static void main(String[] args) {
	        int[] arr = {100, 4, 200, 1, 3, 2};
	        System.out.println("Longest consecutive sequence length: " + longestConsecutive(arr));
	    }
	}
