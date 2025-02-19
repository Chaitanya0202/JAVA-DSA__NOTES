package inheritance;

public class Dog extends Animal{
	String s1="Bye";
	public Dog() {
		super.eat();
	}
	public void eat() {
		System.out.println("Dog is Eating Biscuit");
	}

}
