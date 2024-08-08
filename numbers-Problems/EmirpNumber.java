package numbers;

public class EmirpNumber {

	public static void main(String[] args) {
		//13 Prime --> Needs to prime After Reverse the number
		int num=13;
		int rev=0;
		int temp=num;
		
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		System.out.print(temp+" ");

        if (isPrime(temp) && isPrime(rev) && temp != rev) {
			System.out.println("Emirp Number");
		}else {
			System.out.println("Not Emirp number");
		}
		
	}
	public static boolean isPrime(int number) {
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
}
