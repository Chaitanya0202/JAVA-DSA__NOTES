package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BasicArrayList {

	public static void main(String[] args) {
//		Methods -> .add , .get , .set , .remove
		ArrayList<Integer> nums=new ArrayList<Integer>();
		//Add Elements
		nums.add(3);
		nums.add(4);
		nums.add(9);
		nums.add(1);
		nums.add(5);
		System.out.println(nums);
		
		System.out.println(nums.size());
		
		// access Based on Index 
		System.out.println(nums.get(2));
		
//		Update the element
		nums.set(0, 100);
		System.out.println(nums);
		
		// Iterating with Enhased For loop
		for(int n:nums) {
			System.out.println(n);
		}
//		 Remove elements
//		nums.remove(0);
//		System.out.println(nums);
		
//		Sorting Using Collections method(.sort)
		Collections.sort(nums);
		System.out.println(nums);
		
		
		System.out.println(nums.isEmpty());
//		remove all Ele
//		nums.clear();
		System.out.println(nums.contains(4));
		
	}
}
