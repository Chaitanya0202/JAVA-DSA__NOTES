package numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number= sc.nextInt();
		
		int temp=number;
		int res=0;
		String len=String.valueOf(number);
		
		while(number > 0) {
			int digit=number%10;
			
			int sum=1;
			
//			for(int i=0;i<len.length();i++) {
//				sum=sum*digit;
//			}
//			    	
			res+=Math.pow(digit, len.length());
//			
//			res=res+sum;
			number=number/10;
		}
		if(temp==res) {
			System.out.println("THe Number Is ArmStrong");
		}
		else {
			System.out.println("THe NUmber Is NOT ArmStrong");
		}
		
	}
}
