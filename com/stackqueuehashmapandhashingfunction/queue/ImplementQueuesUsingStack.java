package stackqueuehashmapandhashingfunction.queue;
import java.util.*;
public class ImplementQueuesUsingStack {
	 Stack<Integer> enqueueStack = new Stack<>();
	    Stack<Integer> dequeueStack = new Stack<>();

	    // Add an element to the queue
	    public void enqueue(int value) {
	        enqueueStack.push(value);
	    }

	    // Remove and return the front element of the queue
	    public int dequeue() {
	        if (dequeueStack.isEmpty()) {
	            while (!enqueueStack.isEmpty()) {
	                dequeueStack.push(enqueueStack.pop()); // Reverse the order
	            }
	        }
	        if (dequeueStack.isEmpty()) {
	            throw new RuntimeException("Queue is empty");
	        }
	        return dequeueStack.pop();
	    }

	    // Display the front element of the queue
	    public int peek() {
	        if (dequeueStack.isEmpty()) {
	            while (!enqueueStack.isEmpty()) {
	                dequeueStack.push(enqueueStack.pop());
	            }
	        }
	        if (dequeueStack.isEmpty()) {
	            throw new RuntimeException("Queue is empty");
	        }
	        return dequeueStack.peek();
	    }

	    public static void main(String[] args) {
	    	ImplementQueuesUsingStack queue = new ImplementQueuesUsingStack();
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);
	        System.out.println("Dequeued: " + queue.dequeue());
	        System.out.println("Peek: " + queue.peek());
	        queue.enqueue(4);
	        System.out.println("Dequeued: " + queue.dequeue());
	    }
	}