package HasMapExample;

import java.util.HashMap;

//Key-value  Pair 
public class HashMaping {
	public static void main(String[] args) {
//		HashMap<String, Integer> student=new HashMap<>();
//		student.put("satish", 18);
//		student.put("anil", 23);
//		System.out.println(student);

		HashMap<Integer, String> map = new HashMap<>();

		// Adding key-value pairs
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(4, "Grapes");

		// Updating a value
		map.put(2, "Mango"); // Replaces "Banana"

		// Displaying the HashMap
		System.out.println("HashMap: " + map);

		// Accessing a value by key
		System.out.println("Value for key 3: " + map.get(3));

		// Checking if a key exists
		System.out.println("Contains key 2? " + map.containsKey(2));

		// Checking if a value exists
		System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

		// Removing a key-value pair
		map.remove(4);
		System.out.println("After removing key 4: " + map);

		// Iterating over key-value pairs
		System.out.println("Iterating over HashMap:");
		for (Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}

	}
}
