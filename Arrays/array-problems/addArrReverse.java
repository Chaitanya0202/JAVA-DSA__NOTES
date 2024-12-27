package arr;

public class addArrReverse {
	public static void main(String[] args) {
		
		int [] arr1= {1,2,3,4,5};
		int [] arr2=  {6,7,8,9};
		int [] arr3=new int [arr1.length+arr2.length];
//********add second array in reverse order
		
		for(int i=0;i<arr3.length;i++) {
			
			if(i<arr1.length) {
				arr3[i]=arr1[i];
				
			}
			else {
				arr3[i]=arr2[arr3.length-1-i];
			}
//********* add both array by making reverse
//			if(i<arr1.length) {
//				arr3[i]=arr1[arr1.length-1-i];
//				
//			}
//			else {
//				arr3[i]=arr2[arr3.length-1-i];
//			}
//			System.out.println(arr3[i]);
		}
	}
}
