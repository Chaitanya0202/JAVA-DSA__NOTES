package polymorphism;
class Test {
	public void add(int a,int b) {
		System.out.println("Addition is "+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Addition of "+a + b +"and "+
	c+" is "+(a+b+c));
	}
}


public class MathOperationOverLoading {

	public static void main(String[] args) {
		Test t=new Test();
		t.add(2, 4);
		t.add(2, 4,8);
	}
}
