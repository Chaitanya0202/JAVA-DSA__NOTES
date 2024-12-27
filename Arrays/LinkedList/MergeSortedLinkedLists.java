package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class MergeSortedLinkedLists {

	
	public static LinkedList<Integer> mergeSortedLinkedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
	    LinkedList<Integer> mergedList = new LinkedList<>();
	    Iterator<Integer> it1 = list1.iterator();
	    Iterator<Integer> it2 = list2.iterator();
	    
	    Integer val1 = it1.hasNext() ? it1.next() : null;
	    Integer val2 = it2.hasNext() ? it2.next() : null;
	    
	    while (val1 != null && val2 != null) {
	        if (val1 <= val2) {
	            mergedList.add(val1);
	            val1 = it1.hasNext() ? it1.next() : null;
	        } else {
	            mergedList.add(val2);
	            val2 = it2.hasNext() ? it2.next() : null;
	        }
	    }
	    
	    while (val1 != null) {
	        mergedList.add(val1);
	        val1 = it1.hasNext() ? it1.next() : null;
	    }
	    
	    while (val2 != null) {
	        mergedList.add(val2);
	        val2 = it2.hasNext() ? it2.next() : null;
	    }
	    
	    return mergedList;
	}

	public static void main(String[] args) {
		
		LinkedList<Integer>nums=new LinkedList<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(7);
		
		LinkedList<Integer>nums2=new LinkedList<Integer>();
		nums2.add(1);
		nums2.add(4);
		nums2.add(6);
		nums2.add(8);
		
		System.out.println( mergeSortedLinkedLists(nums, nums2));
	}
}

