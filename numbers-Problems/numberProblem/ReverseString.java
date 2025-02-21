package numberProblem;

import java.util.Iterator;

public class ReverseString {
	public static void main(String[] args) {
		String str="Hello";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
			
		}
		System.out.println(rev);
		
		//using StringBuilder
//		String reversed=new StringBuilder(str).reverse().toString();
//		System.out.println(reversed);
	}

}
