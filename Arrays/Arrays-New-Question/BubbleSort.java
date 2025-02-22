package Arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {				
				int temp=0;
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
