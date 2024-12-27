package Polymorphis;

public class Driver {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 2;
		MethodOverLoading m1 = new MethodOverLoading();
		System.out.println("Addition for Two number is " + m1.addition(a, b));
		System.out.println("Addition for Three number is " + m1.addition(a, b, c));
	}
}
