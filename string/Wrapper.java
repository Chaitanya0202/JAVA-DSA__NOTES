package string;

import java.awt.Window.Type;

public class Wrapper {
	public static void main(String[] args) {
		Integer a=10;//autoboxing
		System.out.println(a.toString());
		System.out.println(a.getClass().getSimpleName());
		
		int b=a;//auto unboxing
		System.out.println(b);
		
//		--->ValueOf Method- used to primitive -->NOn Primitive[int-->string]
		int num=20;
		String numString=String.valueOf(num);
		System.out.println(numString.getClass().getSimpleName());//string
		
//		--->Prsing -> used to convert string  back to the respective datatype
		
		String s="12";
//		String s="hello";//NumberFormateException
		int s1=Integer.parseInt(s);
		System.out.println(s1);
		
		
	}

}
