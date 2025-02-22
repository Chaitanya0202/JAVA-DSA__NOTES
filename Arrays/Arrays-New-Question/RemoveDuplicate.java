package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		int[] arr= {2,3,2,5,6,3,67,67};
		int []res=new int[arr.length];
		int j=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				res[j++]=arr[i];
			}
			
		}		
		 res[j++] = arr[arr.length - 1];// output - [2, 3, 5, 6, 67, 0, 0, 0]
		 
		 int[] unique=Arrays.copyOf(res, j);
		System.out.println(Arrays.toString(unique));
	}

}
