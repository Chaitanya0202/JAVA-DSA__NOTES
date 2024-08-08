package numbers;

public class FactorialOfNumber {
	public static void main(String[] args) {
		
		int num=5;
		int res=1;
		for(int i=num;i>0;i--) {
			res=res*i;
		}
		System.out.println( "Factorial Of The "+num+ " is "+res);
		
	}
}
