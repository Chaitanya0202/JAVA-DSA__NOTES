package numbers;

public class BuzzNumber {

	public static void main(String[] args) {
		int num=143;
		if(num%7==0 || num%10==7) {
			System.out.println("Buzz Number");
		}else {
			System.out.println("Not Buzz");
		}
	}
}
