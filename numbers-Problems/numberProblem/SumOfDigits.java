package numberProblem;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=1234;
		int res=0;
		int digit;
		while(num>0) {
			digit=num%10;
			res += digit;
			num=num/10;
			
		}
//		 for(int i=num;i>0; i=i/10) {
//			 digit=num%10;
//				res += digit;
//				num=num/10;digit=num%10;
//				res += digit;
//				num=num/10;
//		 }
		System.out.println("Sum : "+res);
		
	}

}
