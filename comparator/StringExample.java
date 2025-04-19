package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// 1.  Using Anonymous Comparator Class:
class SortString implements Comparator<String>{
	public int compare(String o1, String o2) {
		return o2.length()-o1.length();
	}	
}

public class StringExample {
	public static void main(String[] args) {
		
		List<String>list= new ArrayList<String>();
		list.add("Apple");
		list.add("Cheri");
		list.add("Banana");
		list.add("Kiwi");
		// 1.
//		Collections.sort(list,new SortString());
//		System.out.println(list);
		
		// 2.Using Lambda		
		Collections.sort(list,(s1,s2)->s2.length()-s1.length());
// 					    OR
//		list.sort((s1, s2) -> s1.length() - s2.length());
//		System.out.println(list);
		
		// 3 . Using Comparing 
//		list.sort(Comparator.comparing(String::length).reversed());
//		System.out.println(list);
		
		
//--------- Sort By Alphabate
		Collections.sort(list,(a,b)->a.compareTo(b));
		System.out.println(list);
	}
	

}

