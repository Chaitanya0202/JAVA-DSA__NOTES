package numbers;

public class AutomorphicNumber {

	// 76 --> 76*76 = 5776 Compare Last Digit after Squre and Before 
//	if it is same then Its automorphic Number
//	EX 0, 1, 5, 6, 25, 76, 376
	public static void main(String[] args) {
		
		int num=76;
		int sq=num*num;
		if(num%10==sq%10) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println(" NOT Automorphic Number");
		}
	}
}
