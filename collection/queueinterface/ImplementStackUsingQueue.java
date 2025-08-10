package queueinterface;
import java.util.*;
public class ImplementStackUsingQueue {
	    static class MyStack {
	        Queue<Integer> q1 = new LinkedList<>();
	        Queue<Integer> q2 = new LinkedList<>();

	        public void push(int x) {
	            q1.offer(x);
	        }

	        public int pop() {
	            while (q1.size() > 1) {
	                q2.offer(q1.poll());
	            }
	            int top = q1.poll();
	            Queue<Integer> temp = q1;
	            q1 = q2;
	            q2 = temp;
	            return top;
	        }

	        public int top() {
	            while (q1.size() > 1) {
	                q2.offer(q1.poll());
	            }
	            int top = q1.peek();
	            q2.offer(q1.poll());
	            Queue<Integer> temp = q1;
	            q1 = q2;
	            q2 = temp;
	            return top;
	        }

	        public boolean empty() {
	            return q1.isEmpty();
	        }
	    }

	    public static void main(String[] args) {
	        MyStack stack = new MyStack();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        System.out.println("Top: " + stack.top()); // 3
	        System.out.println("Popped: " + stack.pop()); // 3
	        System.out.println("Popped: " + stack.pop()); // 2
	    }
	}
