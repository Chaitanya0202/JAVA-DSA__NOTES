package setInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetExample {
	public static void main(String[] args) {
		 HashSet<Integer> numbers = new HashSet<Integer>();
//		 For getting elements sorted -->use TreeSet
//       TreeSet<Integer> numbers = new TreeSet<Integer>();
	        // Adding elements
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        // Attempting to add a duplicate element
	        numbers.add(20); // Duplicate, won't be added

	        // Displaying the HashSet
	        System.out.println("Numbers: " + numbers);

	        // Checking if an element exists
	        System.out.println("Contains 30? " + numbers.contains(30));

	        // Removing an element
	        numbers.remove(40);
	        System.out.println("After removing 40: " + numbers);

	        // Iterating over elements
	        System.out.println("Iterating over HashSet:");
	        
	        for (Integer num : numbers) {
	            System.out.println(num);
	        }
	        ///Iterator
	        Iterator it=numbers.iterator();
	        while(it.hasNext()) {
	        	System.out.println("Number : "+ it.next());
	        }
	        
	}
}
