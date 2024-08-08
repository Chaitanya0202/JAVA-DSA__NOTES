package numbers;

import java.util.Scanner;

public class FibonacciSeries {
// 0,1,1,2,3,5,8,13
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int nth=sc.nextInt();
		int a=0;
		int b=1;;
		System.out.print(a+",");
		System.out.print(b+",");
		for(int i=0;i<nth;i++) {
			int temp=a+b;
			System.out.print(temp+",");
			a=b;
			b=temp;
			
			
		}
	}
}
