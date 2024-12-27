package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class BasicArrayDeque2 {

	public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the front
        deque.addFirst(10);
        deque.addFirst(20);

        // Adding elements to the back
        deque.addLast(30);
        deque.addLast(40);

        System.out.println("Deque after adding elements: " + deque);
        // Output: [20, 10, 30, 40]
        System.out.println(deque);
        
        
        // Removing elements from the front
        int removedFront = deque.removeFirst();
        System.out.println("Removed from front: " + removedFront); // 10

        // Removing elements from the back
        int removedBack = deque.removeLast();
        System.out.println("Removed from back: " + removedBack); // 40

        System.out.println("Deque after removals: " + deque);
        // Output: [20]
        
        System.out.println(deque);
        
     // Accessing the front element
        int frontElement = deque.peekFirst();
        System.out.println("Front element: " + frontElement); // 10

        // Accessing the back element
        int backElement = deque.peekLast();
        System.out.println("Back element: " + backElement); // 30
        
        System.out.println(deque);
        
        
     // Iterating through elements using a for-each loop
        System.out.println("Iterating through deque:");
        for (int element : deque) {
            System.out.println(element);
        }
        // Output:
        // 10

        // 30
        

        // Check if the deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty()); // true

        deque.addFirst(10);
        System.out.println("Is deque empty after adding an element? " + deque.isEmpty()); // false
        
        
     // Clear all elements
        deque.clear();
        System.out.println("Deque after clearing: " + deque); // Output: []
    }
}
