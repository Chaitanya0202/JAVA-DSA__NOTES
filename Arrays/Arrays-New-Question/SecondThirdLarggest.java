package Arrays;

import java.util.Arrays;

public class SecondThirdLarggest {

	public static void main(String[] args) {
		
		int [] nums= {9,32,328,5,59,59,59,7};
		int []numbers=new int[5];
		
		// Second & Third Largest Number
		Arrays.sort(nums);
		System.out.println(nums[nums.length-1]);
		int secondLargest=-1;
		int thirdlarg=-1;
		int larggest=nums[nums.length-1];
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]<larggest) {
				secondLargest=nums[i];
				break;
			}
		}
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]<secondLargest) {
				thirdlarg=nums[i];
				break;
			}
		}
		
		System.out.println(secondLargest+" "+thirdlarg);
	}
}
