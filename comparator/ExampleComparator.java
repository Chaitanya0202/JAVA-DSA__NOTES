package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


class SortNum implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return (Integer)o2- (Integer)o1;
	}
}
public class ExampleComparator {
	public static void main(String[] args) {
		ArrayList<Integer>list	 =new ArrayList<Integer>();
		list.add(2);
		list.add(9);
		list.add(3);
		list.add(4);
		
		// comparator is used for sort in custom way/
		//1. Create Implement class because we cant create object of Comparator interface
		// 
		
//		Collections.sort(list, new SortNum() );
//		System.out.println(list);
		
		// 2. Using Lambda Expression
		
		//asending order
		Collections.sort(list, (a,b)->a-b);
//		    desending order
//		Collections.sort(list, (a,b)->b-a);
		System.out.println(list);
		
		
		
		
		
		
		
		
//		Iterate		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		for(Integer i:list) {
//			System.out.println(i);
//		}
		
			
	}
}
