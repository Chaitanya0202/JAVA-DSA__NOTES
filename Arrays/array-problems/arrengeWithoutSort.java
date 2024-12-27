package arr;

import java.util.Arrays;

public class arrengeWithoutSort {
	public static void main(String[] args) {
		int [] a= {1,-5,-3,7,-4,-8};
		
		int st=0;
		int end=a.length-1;
		
		while(st<end) {
			while(a[st]<0 && st<a.length-1) {
				st++;
			}
			while(a[end]>0 && end>0) {
				end--;
			}
			
			int temp=a[st];
			a[st]=a[end];
			a[end]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
