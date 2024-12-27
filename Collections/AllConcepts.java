package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class AllConcepts {
	
	public static void main(String[] args) {
		//List->allow Duplicate
		
		
		//ArrayList
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Apple");
		a1.add("Mongo");
		System.out.println("ArrayList is "+ a1 );
		
		// Linked List--> Internally implements List
		   LinkedList<Integer> l1=new  LinkedList<>();
		   l1.add(3);
		   l1.add(5);
		   l1.addFirst(9);
		   System.out.println("LinkedList is "+ l1 );
		   
	// SET -->  hasset , treeset
		   //hassset
		   Set<String> set = new HashSet<>();
		   set.add("A");
		   set.add("B");
		   set.add("A"); // Duplicate ignored
		   System.out.println("Hasset "+set); // [A, B] (order not guaranteed)
		   //treeset--> auto sort
		   Set<Integer> set2 = new TreeSet<>();
		   set2.add(20);
		   set2.add(10);
		   set2.add(30);
		   System.out.println(" TreeSet"+set2); // [10, 20, 30]

	 //MAP-->HashMap,treemap,LinkedHashMap
		   //hashmap
		   Map<Integer, String> h1=new HashMap<>();
		   h1.put(2, "Chetan");
		   h1.put(1, "Chavan");
		   System.out.println("HashMap is "+ h1);
		   //TreeMap
		   Map< Integer, String> t1=new TreeMap<>();
		   t1.put(10, "Ten");
		   t1.put(5, "Five");
		   System.out.println("TREEMAP "+ t1);
		   //LinkedHashMap
		   Map<Integer, String> map = new LinkedHashMap<>();
		   map.put(2, "Apple");
		   map.put(1, "Banana");
		   System.out.println(" LinkedHashMap"+map); // {1=Apple, 2=Banana}

	//Stack and Queue\-->Stack: Last In, First Out (LIFO).
		                //Queue: First In, First Out (FIFO).
		   Stack<Integer> stack = new Stack<>();
		   stack.push(1);
		   stack.push(2);
		   stack.push(6);
		   System.out.println(stack.pop()); // 6 (Last element removed)
		   System.out.println(stack);

		   //Queue (ArrayDeque):
		   Queue<String> queue = new ArrayDeque<>();
		   queue.add("John");
		   queue.add("Jane");
		   System.out.println(queue.remove()); // John (First element removed)
		   
		   //PriorityQueue
		   PriorityQueue<Integer> pq = new PriorityQueue<>();
		   pq.add(30);
		   pq.add(10);
		   pq.add(20);
		   System.out.println(pq.poll()); // 10 (Smallest element removed)


	}

}
