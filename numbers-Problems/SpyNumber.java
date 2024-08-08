package numbers;

public class SpyNumber {
//1124 if sum And Product of all Digits should be same
//	1+1+2+4 == 1*1*2*4
	public static void main(String[] args) {
		int num=1124;
		int temp=num;
		int sum=0;
		int product=1;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			product*=digit;
			num/=10;
		}
		if(sum==product) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not spy Number");
		}
		
	}
}
