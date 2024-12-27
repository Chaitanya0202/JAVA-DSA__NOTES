package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class BasicLikedList {

	public static void main(String[] args) {
		
		LinkedList<Integer>nums=new LinkedList<Integer>();
//		add Elements
		nums.add(3);
		nums.add(5);
		nums.add(8);
		nums.add(1);
		System.out.println(nums);
		 
//		add Elements In Specific Index ex. add 500 after 5 and before 8
		nums.add(2, 500);
		System.out.println(nums);
		
		
//		add Elements At First At Last
		nums.addFirst(100);
		nums.addLast(0);
		System.out.println(nums);
		
//		Remove Elements At First And At Last
		nums.removeLast();
		nums.removeFirst();
		System.out.println(nums);
		
//		Add Another LinkedList method-> addAll(index,collection)
		
	    LinkedList<Integer> moreNums = new LinkedList<>();
        moreNums.add(4);
        moreNums.add(5);
        moreNums.add(6);
//        add At last
//		nums.addAll(moreNums);
		System.out.println(nums);
		
//		add At Specific Index
		nums.addAll(1, moreNums);
		System.out.println(nums);	
		
//		Update the Element
		nums.set(0, 1000);
		System.out.println(nums);
		
		
//		Iterate using Iterator
		Iterator<Integer>ints=nums.iterator();
		while(ints.hasNext()) {
			Integer n=ints.next();
			System.out.println(n);
		}
		
		
	}
}
