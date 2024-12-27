package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPI {
	
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		
		
		list.add(45);
		list.add(5);
		list.add(6);
		list.add(2);
		System.out.println("ArrayList "+list);
		// Q- Filter the Even Number from the list array
		// without using Strean API
		
		List<Integer>evenList=new ArrayList<>();
		for(Integer i:list) {
			if(i%2==0) {
				evenList.add(i);
			}
		}
		System.out.println(evenList);
		
//		/Using Stram APi And Lambda

		Stream<Integer>stream1=list.stream();
		List<Integer>evenList2=stream1.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenList2);
																								
		
	}

}
