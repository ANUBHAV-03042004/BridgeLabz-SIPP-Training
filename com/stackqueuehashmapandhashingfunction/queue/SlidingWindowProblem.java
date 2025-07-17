package stackqueuehashmapandhashingfunction.queue;
import java.util.*;

public class SlidingWindowProblem {
	    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
	        List<Integer> result = new ArrayList<>();
	        Deque<Integer> dq = new ArrayDeque<>();

	        for (int i = 0; i < nums.length; i++) {
	            // Remove elements out of current window
	            if (!dq.isEmpty() && dq.peek() <= i - k) {
	                dq.poll();
	            }

	            // Remove smaller elements from end
	            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
	                dq.pollLast();
	            }

	            dq.offer(i); // add current index

	            // Add to result when window is valid
	            if (i >= k - 1) {
	                result.add(nums[dq.peek()]);
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
	        int k = 3;
	        System.out.println("Sliding window max: " + maxSlidingWindow(nums, k));
	    }
	}
