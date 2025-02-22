package Arrays;
import java.util.Arrays;

public class MergeTwoSorted {

	public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};
        int [] merged=new int[arr1.length+arr2.length];
        int j=0;
        
//        for(int i=0;i<merged.length;i++) {
//        	if(i<arr1.length) {
//        		merged[i]=arr1[i];
//        	}
//        	else {
//        		merged[i]=arr2[j];
//        		j++;
//        	}
//        }
//        Arrays.sort(merged);
//        System.out.println(Arrays.toString(merged));
//        ------------ Second Way
        int i = 0, k = 0;

        // Merge both arrays in sorted order
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1 (if any)
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2 (if any)
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(merged));
		
	}
}
