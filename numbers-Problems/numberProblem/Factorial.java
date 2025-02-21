package numberProblem;

import java.util.Scanner;

public class Factorial {
	public static long factorial(int n) {
	    if (n == 0 || n == 1) {  // Base case
	        return 1;
	    }
	    return n * factorial(n - 1);  // Recursive call
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int nth=sc.nextInt();
		
		 long result = factorial(nth);
	        System.out.println("Factorial of " + nth + " is: " + result);
		
//		int factorial=1;
//		for(int i=nth;i>0;i--) {
//			factorial *=i;
//		}
//		System.out.println("Factorial is : "+factorial);
	}

}
