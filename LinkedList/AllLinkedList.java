package LinkedList;

import java.util.LinkedList;

public class AllLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");

        // Adding at first and last position
        list.addFirst("Mango"); // ["Mango", "Apple", "Banana"]
        list.addLast("Orange"); // ["Mango", "Apple", "Banana", "Orange"]

        System.out.println("LinkedList: " + list);  
        // Output: LinkedList: [Mango, Apple, Banana, Orange]

        // Accessing first and last elements
        System.out.println("First Element: " + list.getFirst());  // Output: Mango
        System.out.println("Last Element: " + list.getLast());    // Output: Orange

        // Removing first and last elements
        list.removeFirst(); // Removes "Mango"
        list.removeLast();  // Removes "Orange"

        System.out.println("After Removal: " + list);  
        // Output: After Removal: [Apple, Banana]
    }
}
