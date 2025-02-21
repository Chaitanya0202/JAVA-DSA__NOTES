package numberProblem;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 
		int a=0 ;
		int b=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Nth Value: ");
		int nth= sc.nextInt();
		
		System.out.print(a+" "+b+" ");
		for(int i=0;i<nth;i++)
		{
			
			System.out.print(a+b+" ");
			int temp=a;
			a=b;
			b=temp+b;
		}
	}

}
