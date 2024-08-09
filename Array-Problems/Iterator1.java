package arr;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator1 {
	public static void main(String[] args) {
		ArrayList<String>s=new ArrayList<String>();
		s.add("blr");
		s.add("mumbai");
		s.add("chhennai");
		ListIterator<String>l1=s.listIterator();
		while(l1.hasNext()) {
			String it=l1.next();
//			if(it.length()%2==0) {
				System.out.println(it);
//			}
		}
	}
}
