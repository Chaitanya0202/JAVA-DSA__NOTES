package arr;

import java.util.Scanner;

public class keith1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt(); //742
		
		int [] a=new int[countDigit(num)];
		
		a=copyDigit(num,a);
	
		int sum=sumDigit(a);
		
		if(num!=sum) {
			while(true) {
				for(int i=0;i<a.length-1;i++) {
					a[i]=a[i+1];
					
				}
				a[a.length-1]=sum;
				sum=sumDigit(a);
				
				if(num==sum) {
					System.out.println("Iti is Keith Nuber");
					break;
				}
				else if(sum>num){
					System.out.println(sum);
					System.out.println("not keith");
					break;
				}
			}
			
		}
		else {
			System.out.println("it is keith");
		}
		
	}
	public static int countDigit(int num) {
		int ct=0;
		while(num!=0) {
			ct++;
			num/=10;
//			System.out.println(ct);
		}
		return ct;
	}
//	for converting number to array 
	
	public static int [] copyDigit(int num,int[]a){
		for(int i=0;i<a.length;i++) {
			a[i]=num%10;
			num/=10;
//			System.out.println(a[i]);
		}
		return a;
	}
	public static int sumDigit(int []a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		return sum;
	}
	
}
