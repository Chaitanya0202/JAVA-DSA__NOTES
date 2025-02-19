package Encapsulation;
//Note - its gives flexibility to make variable
// only readable , write only, read and not write
// or not read only write or both read only or both
// write only
 class Person {
	
	private String name;
	private int age;
	
	//getter 
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	//setter
	public void setName(String name) {
		this.name=name;
	}
	
	 // 5. Public setter for age (with validation)
    public void setAge(int age) {
        if (age > 0) {  // Ensuring age is a positive value
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }
}

//Main class to test Encapsulation
public class PersonDriver {
 public static void main(String[] args) {
     // Creating an object of Person class
     Person person = new Person();

     // Setting values using setter methods
     person.setName("Chetan Chavan");
     person.setAge(25); // Valid age

     // Getting values using getter methods
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());

     // Trying to set invalid age
     person.setAge(-5);  // Output: Age cannot be negative!
 }
}
