package arr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConvertArrToHasset {
	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("joke");
		a1.add("moke");
		a1.add("sokw");
		
		
		HashSet h=new HashSet<>(a1);
		System.out.println(h);
		System.out.println(a1);
	}
}
