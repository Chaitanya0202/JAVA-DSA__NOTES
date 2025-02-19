package inheritance;
// single Level inheritance
// multi level inheritance
// multiple level inheritance -> not possible using classes but we can
					// possible with interface
// Hierarchical inheritance -> multiple Childs inheritance one parent class

// hybrid inheritance-> combination of more inheritance
public class AnimalDriver {
	public static void main(String[] args) {
		
		Dog a=new Dog();		
		System.out.println(a.s1);
		a.eat();
		
		// need to do upcast if want to refere parent 
		// properties in Driver class
		Animal animal=new Dog();
		System.out.println(animal.s1);
		
	}

}
