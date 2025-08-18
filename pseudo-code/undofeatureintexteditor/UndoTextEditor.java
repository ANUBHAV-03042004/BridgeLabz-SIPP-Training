package undofeatureintexteditor;

import java.util.Stack;

public class UndoTextEditor {
 public static void main(String[] args) {
     Stack<String> stack = new Stack<>();

     // User typing actions
     stack.push("Hello");
     stack.push("Hello World");
     stack.push("Hello World!!!");

     System.out.println("Current Text: " + stack.peek());

     // Undo last action
     stack.pop();
     System.out.println("After Undo: " + stack.peek());

     // Undo again
     stack.pop();
     System.out.println("After Second Undo: " + stack.peek());
 }
}

