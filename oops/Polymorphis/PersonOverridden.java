package polymorphism;

class Person{
	int a=10;
	public void show() {
		System.out.println("Person Showing ");
	}
}
class Impl extends Person {
	int a=20;
	public void show() {
		System.out.println("Implemeent class Showing");
		
	}
}
public class PersonOverridden {

	public static void main(String[] args) {
		Person person=new  Impl();//Upcasted
		person.show();
		System.out.println(person.a);
		
		// DownCasting
		Impl impDownCasted = (Impl) person;// Downcasted
		System.out.println(impDownCasted.a);
		
//		NOTE-> class castExpection when we try to downcast
		// without upcasting the object
		
		
	}
}
