package Arrays;

import java.util.Arrays;

public class RoteteArrayLeft {

	public static void main(String[] args) {
		// Right Shift 
//		int []arr1 = {1, 2, 3, 4, 5}  ;
//		int temp=arr1[arr1.length-1];
//		
//		for(int i=arr1.length-2;i>=0;i--) {			
//				arr1[i+1]=arr1[i];				
//		}
//		
//		arr1[0]=temp;
//		System.out.println(Arrays.toString(arr1));
		
//		--------- Left Shift
		int []arr1 = {1, 2, 3, 4, 5}  ;
		int temp=arr1[0];
		
		for(int i=0;i<arr1.length-1;i++) {			
				arr1[i]=arr1[i+1];				
		}
		
		arr1[arr1.length-1]=temp;
		System.out.println(Arrays.toString(arr1));
		
		
	}
}
