package arr;

public class fibonacci {
	public static void main(String []args) {
		int [] a= {0,1,3,5,2,6,9,10,13};
		for(int i=0;i<a.length;i++) {
			if(isfibo(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	public static boolean isfibo(int num) {
		int x=0,y=1,z=0;
		while(z<=num) {
			if(z==num) {
				return true;
			}
			x=y;
			y=z;
			z=x+y;
		}
		return false;
	}
}
