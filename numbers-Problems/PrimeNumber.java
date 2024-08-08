package numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter Number: ");
		int num=sc.nextInt();
		 boolean flag=false;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
			}
		}
//		 --------- second way
//		  if(num%2==0 || num%3==0 || num%5==0 || num%7==0) {
//			  flag=true;
//		  } // 121 , 49 ,91 ,119
		 
		if(flag==true) {
			System.out.println("Number Is Not Prime");
		}
		else {
			System.out.println("Number Is  Prime");
		}
		
	}
}
