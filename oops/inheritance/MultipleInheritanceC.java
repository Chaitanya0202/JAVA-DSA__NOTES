package inheritance;
// implementing A ,B classes because we can`t create
// object of the interface
// 
public class MultipleInheritanceC implements MultipleInheritanceA, MultipleInheritanceB {
// neseecery to give implementation in class
	public void show() {
		System.out.println("in Driver class");
	}
}
