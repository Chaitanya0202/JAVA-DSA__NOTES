package numbers;

import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
		int count;
        int num = 192;
        int firstNum = num * 2;
        int secNum = num * 3;
        String finalNum = num + "" + firstNum + "" + secNum;

        if (finalNum.length() != 9) {
            System.out.println("Not a Fascinating Number");
            System.exit(1);
        }

        for (int i = 1; i < 10; i++) {
            count = 0; // For finding duplicates and missing numbers
            for (int j = 0; j < finalNum.length(); j++) {
                char ch = finalNum.charAt(j);
                if (ch - '0' == i) {
                    count++;
                }
            }
            if (count < 1) {
                System.out.println("The Missing Number is " + i);
                System.exit(1);
            } else if (count > 1) {
                System.out.println("Duplicate Number found: " + i);
                System.exit(1);
            }
        }

        System.out.println(num + " is a Fascinating Number");
	}
}
