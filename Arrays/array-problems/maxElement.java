package arr;

public class maxElement {
	public static void main(String[] args) {
		int max=0;
		int min=0;
		int [] a= {1,73,5,2,65,2};
		
		for(int i=0;i<a.length-1;i++) {
		   if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}
}
