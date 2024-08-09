package arr;

public class missingElement {
	public static void main(String[] args) {
		int []a= {1,2,4,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
		}
		int tot=0;
		
		for(int i=1;i<=max;i++) {
			tot=tot+i;
		}
		System.out.println(tot-sum);
//		 formula for sum of n natural number
		
//		int ans=max*(max+1)/2;
//		System.out.println(ans);
	}
}
