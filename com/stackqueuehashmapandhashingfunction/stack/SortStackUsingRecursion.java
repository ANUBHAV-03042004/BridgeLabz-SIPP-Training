package stackqueuehashmapandhashingfunction.stack;
import java.util.Stack;
public class SortStackUsingRecursion {
	    // Recursive function to sort the entire stack
	    public void sortStack(Stack<Integer> stack) {
	        if (!stack.isEmpty()) {
	            int top = stack.pop();              // Remove top item
	            sortStack(stack);                   // Sort remaining stack
	            insertInSortedOrder(stack, top);    // Insert top back at correct position
	        }
	    }

	    // Helper function to insert element in sorted order
	    private void insertInSortedOrder(Stack<Integer> stack, int value) {
	        if (stack.isEmpty() || stack.peek() <= value) {
	            stack.push(value);
	        } else {
	            int top = stack.pop();
	            insertInSortedOrder(stack, value);
	            stack.push(top); // Restore the top element
	        }
	    }

	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        stack.push(3);
	        stack.push(1);
	        stack.push(4);
	        stack.push(2);

	        System.out.println("Original Stack: " + stack);
	        SortStackUsingRecursion  sorter = new SortStackUsingRecursion ();
	        sorter.sortStack(stack);
	        System.out.println("Sorted Stack: " + stack);
	    }
	}
