package StackAll;

import java.util.Stack;
public class StackEx {

	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack); // Output: [10, 20, 30]

        // Peeking the top element
        System.out.println("Top Element: " + stack.peek()); // Output: 30

        // Popping the top element
        System.out.println("Popped Element: " + stack.pop()); // Output: 30
        System.out.println("Stack After Pop: " + stack); // Output: [10, 20]

        // Checking if the stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty()); // Output: false
    }
}
