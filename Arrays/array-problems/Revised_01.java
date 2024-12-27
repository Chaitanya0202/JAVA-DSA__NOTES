package arr;

import java.util.ArrayList;
import java.util.Arrays;

public class Revised_01 {

	public static void main(String[] args) {
//		 ways to create array
//		1)
//		int [] nums= {1,2,3,4};

//		2)Using New Keywords
//		int []nums =new int[5];
//		nums[0]=4;
//		nums[1]=5;
//		nums[2]=6;

		// fill 10
		// Arrays.fill(nums, 10);

		// Creating a copy of an array
		// int [] copyArr =Arrays.copyOf(nums, nums.length);

//		for(int i=0;i<nums.length;i++) {
//			System.out.println(copyArr[i]);
//		}

//		----------------------------------------
//		Sorting
//		int[] num = { 3, 6, 2, 8, 9 };
//		for (int j = 0; j < num.length - 1; j++) {
//			for (int i = 0; i < num.length - 1; i++) {
//
//				if (num[i] > num[i + 1]) {
//					int temp = num[i];
//					num[i] = num[i + 1];
//					num[i + 1] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
//     -----------------------------------------------
		// Merge Array
//		int [] arr1= {1,2,3,4};
//		int []arr2= {5,6,7};
//		
//		int[]merged=new int [arr1.length+arr2.length];
//		
//		for (int i = 0; i < merged.length; i++) {
//			if(i<arr1.length) {
//				merged[i]=arr1[i];
//			}else {
//				merged[i]=arr2[i-arr1.length];
//			}
//			
//		}
//		for (int i = 0; i < merged.length; i++) {
//			System.out.print(" "+ merged[i]);
//		}
//		-------------------------------------------
//		Rotate
//		int [] arr1= {1,2,3,4,5,6,7};
//		int temp=arr1[arr1.length-1];
//		for (int i = arr1.length-1 ;i>0;i--) {
////			arr1[0]=temp;
//			arr1[i]=arr1[i-1];
//		}
//		arr1[0]=temp;
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(" "+ arr1[i]);
//		}
		
		//Second Large
		
//		int [] arr1= {9,2,3,4,5,6,7};
//	  ////     int max = Integer.MIN_VALUE;
//
//		int max=0;
//		int secMax=0;
//		for(int i=0;i<arr1.length;i++) {
//			
//			if(arr1[i]>max) {
//				secMax=max;
//				max=arr1[i];
//			}else if (arr1[i] > secMax && arr1[i] != max) {
//                secMax = arr1[i];  // Update secMax if the current element is the second largest
//            }
//		}
//		System.out.println("Max "+max);
//		System.out.println("SecMax "+secMax);
		
		
//		Convert Array To ArrayList
		
//		 String[] my_array = new String[] {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
//	        ArrayList<?> list = new ArrayList(Arrays.asList(my_array));
//	        System.out.println(list);
		
		// Remove Duplicate Value
		int[] nums = {5, 3, 8, 3, 5, 8, 7};
        int k = 0;
        int[] uni = new int[nums.length];
        boolean isDuplicate;

        for (int i = 0; i < nums.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < k; j++) {
                if (nums[i] == uni[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uni[k] = nums[i];
                k++;
            }
        }
		for (int i = 0; i < uni.length; i++) {
			System.out.print( uni[i]);
		}
		
		
		
	}
}
