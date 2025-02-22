package Arrays;

public class IntersectionOfTwo {
	public static void main(String[] args) {
		int []arr1 = {1, 2, 3, 4, 5}  ;
		int []arr2 = {3, 4, 5, 6, 7,5};
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr2.length-1;j++) {
				if(arr2[i]==arr1[j]) {
					System.out.print(arr2[i]+" ");
				}
			}
		}
	}

}
