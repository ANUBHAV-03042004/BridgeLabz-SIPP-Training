package queueinterface;
import java.util.*;
public class ReverseUsingQueue {
	 public static <T> Queue<T> reverseQueue(Queue<T> queue) {
	        Stack<T> stack = new Stack<>();
	        while (!queue.isEmpty()) stack.push(queue.poll());
	        while (!stack.isEmpty()) queue.offer(stack.pop());
	        return queue;
	    }
	 public static void main(String[] args) {
		 Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30));
	        System.out.println(reverseQueue(q));
	 }
}
