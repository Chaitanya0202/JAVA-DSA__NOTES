package ArrayDeque;

import java.util.ArrayDeque;

public class BasicArrayDeque {

	 public static void main(String[] args) {
	        // Initialize ArrayDeque
	        ArrayDeque<String> deque = new ArrayDeque<>();

	        // Adding elements to the front (head) and end (tail) of the deque
	        deque.addFirst("First");   // Adds to the front
	        deque.addLast("Last");     // Adds to the end
	        deque.offerFirst("Head");  // Adds to the front
	        deque.offerLast("Tail");   // Adds to the end

	        System.out.println("Deque after adding elements: " + deque);

	        // Accessing elements without removal
	        String firstElement = deque.peekFirst();  // Retrieves first element (head)
	        String lastElement = deque.peekLast();    // Retrieves last element (tail)
	        System.out.println("First Element: " + firstElement);
	        System.out.println("Last Element: " + lastElement);

	        // Removing elements from the front (head) and end (tail) of the deque
	        String removedFirst = deque.pollFirst();  // Removes and returns first element
	        String removedLast = deque.pollLast();    // Removes and returns last element
	        System.out.println("Removed First Element: " + removedFirst);
	        System.out.println("Removed Last Element: " + removedLast);

	        System.out.println("Deque after removals: " + deque);

	        // Pushing and popping elements (used as a stack)
	        deque.push("StackElement1");  // Pushes element onto the deque (at the head)
	        deque.push("StackElement2");
	        System.out.println("Deque after pushing elements: " + deque);

	        String poppedElement = deque.pop();  // Pops element from the deque (from the head)
	        System.out.println("Popped Element: " + poppedElement);

	        System.out.println("Deque after popping: " + deque);

	        // Checking if deque contains a specific element
	        boolean containsHead = deque.contains("Head");
	        System.out.println("Deque contains 'Head': " + containsHead);

	        // Iterating through the deque
	        System.out.println("Iterating through the deque:");
	        for (String item : deque) {
	            System.out.println(item);
	        }

	        // Clearing the deque
	        deque.clear();
	        System.out.println("Deque after clearing: " + deque);
	    }
	
}
