package numbers;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class HappyNumber {

//	Let’s consider the number 19:

//    Initial Number: 19
//        Sum of squares of digits: 12+92=1+81=8212+92=1+81=82
//    Next Number: 82
//        Sum of squares of digits: 82+22=64+4=6882+22=64+4=68
//    Next Number: 68
//        Sum of squares of digits: 62+82=36+64=10062+82=36+64=100
//    Next Number: 100
//        Sum of squares of digits: 12+02+02=112+02+02=1
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int num = sc.nextInt();
	        
	        if (isHappy(num)) {
	            System.out.println("The Number Is Happy");
	        } else {
	            System.out.println("The Number Is Not Happy");
	        }
	        
	        sc.close();
	    }
	    
	    // Function to determine if a number is happy
	    private static boolean isHappy(int num) {
	        while (num != 1 && num != 4) {
	            num = sumOfSquaresOfDigits(num);
	        }
	        return num == 1;
	    }
	    
	    // Function to calculate the sum of squares of digits
	    private static int sumOfSquaresOfDigits(int num) {
	        int sum = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit * digit;
	            num /= 10;
	        }
	        return sum;
	}
}
