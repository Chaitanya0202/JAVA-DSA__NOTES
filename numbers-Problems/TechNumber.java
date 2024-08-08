package numbers;

import java.util.Scanner;

public class TechNumber {
  
	public static void main(String[] args) {
		int n, num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		n = sc.nextInt();
		num = n;

		// Cehck Digits
		while (num > 0) {
			digits++;
			num = num / 10;
		}
		
		if (digits % 2 == 0) {
			num = n;
			// determines the first half of the given number
			firstHalf = num % (int) Math.pow(10, digits / 2);
			// determines the second half of the given number
			secondHalf = num / (int) Math.pow(10, digits / 2);
			
			// calculate the square of both the numbers
			squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);
			// compares the square of the sum with the given number
			if (n == squareOfSum) {
				System.out.println(n + " is a tech number.");
			} else {
				System.out.println(n + " is not a tech number.");
			}
		} else {
			System.out.println(n + " is not a tech number.");
		}
	}
}
