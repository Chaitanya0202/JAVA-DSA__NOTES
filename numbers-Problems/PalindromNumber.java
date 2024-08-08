package numbers;

public class PalindromNumber {
//  Peterson number. & Palindrom Number Are same
	public static void main(String[] args) {
		int num=12321;
		
		int sum=0;
		int temp=num;
		int digit;
		while(num>0) {
			digit=num%10;
			sum=(sum*10)+digit;
			System.out.println(sum);
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("Palindrom Number");
		}
		else {
			System.out.println("NOT Palindrom Number");
		}
	}
}
