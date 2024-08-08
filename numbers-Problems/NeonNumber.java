package numbers;

public class NeonNumber {
// 9 sq-> 81 ; 8+1=9
	public static void main(String[] args) {
		int num=9;
		int temp=num;
		int sq=num*num;
		int sum=0;
		while(sq>0) {
			sum=sum+(sq%10);
			sq=sq/10;
		}
		if(temp==sum) {
			
			System.out.println("Neon Number");
		}
		else {
			System.out.println("not Neon Number");			
		}
	}
}
