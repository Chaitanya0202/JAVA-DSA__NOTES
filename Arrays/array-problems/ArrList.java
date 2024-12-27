package arr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ArrList {
	public static void main(String[] args) {
		

//		ArrayList a1=new ArrayList<>();
//		a1.add(3);
//		a1.add("dkf");
//		System.out.println(a1);
//		System.out.println(a1.get(0));
		//Genric Type
//		ArrayList<String>s=new ArrayList<String>();
//		s.add("hello");
//		s.add("hii");
//		
//		for(String c:s) {
//			System.out.println(c);
//		}
//		ArrayList<Integer>i=new ArrayList<Integer>();
//		i.add(3);
//		i.add(4);
//		i.add(2);
//		i.add(27);
//		System.out.println(i);
////		Collections.sort(i);
//		System.out.println(i);
//		
////		Collections.shuffle(i);
//		System.out.println(i);
//		
//		Collections.swap(i, 2, 3);
//		System.out.println(i);
//		
//		List<String>s=new ArrayList<String>();
//		s.add("hello");
//		s.add("hii");
//		s.add("bye");
		List<Integer>num=new ArrayList<Integer>();
		num.add(3);
		num.add(45);
		num.add(2);
		
		Comparator<Integer> com=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					System.out.println(o1.SIZE);
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		Collections.sort(num,com);
		System.out.println(num);
		
	}
	
}
