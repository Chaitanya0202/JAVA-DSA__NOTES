package arr;

public class MergeArray {
	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,5};
		int []arr2=  {6,7,8,9,0,2};
		int [] arr3=new int [arr1.length+arr2.length];
		
//***********for copy all elements in new arreys
		
//		for(int i=0;i<arr1.length;i++) {
//			arr2[i]=arr1[i];
//			System.out.println(arr2[i]);
//		}
		
//***********for concating  two array and creating the new arrey
		
		int b=0;
		for(int i=0;i<arr3.length;i++) {
			if(i<arr1.length) {
				arr3[i]=arr1[i];
				
			}
			else {		
					arr3[i]=arr2[b];
					b++;
//********Second way to add two arrey in new arrey without using third variable
//				arr3[i]=arr2[i-arr1.length];
				
			}
			System.out.println(arr3[i]); 
			
			
		}
	}
}
