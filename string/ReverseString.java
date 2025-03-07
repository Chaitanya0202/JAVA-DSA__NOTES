package string;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String str="Hello";
		//using StringBuuilder
//		StringBuilder str= new StringBuilder("Hello");
//		str.reverse();
//		System.out.println(str);
		
//		---------------Logic
		int left=0,right=str.length()-1;
		char[] charArray=str.toCharArray();
		
		while(left<right) {
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;	
			left++; right--;
		}
		System.out.println(Arrays.toString(charArray));
		str=new String(charArray);
		System.out.println(str);
	}
	// FOr String Every Update Its Create new Object
	// StringBuilder Instead of creating the new object its updating same object
	// and it faster
}
