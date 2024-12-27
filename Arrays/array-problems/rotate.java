package arr;

public class rotate {
	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int num=2;
		for(int j=0;j<num;j++) {
			int temp=a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
