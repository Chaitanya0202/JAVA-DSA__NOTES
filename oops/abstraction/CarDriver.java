package abstraction;


//Abstract class (Car)
abstract class Car {
 // Abstract method (No implementation)
 abstract void start();  

 // Concrete method (Implemented)
 void stop() {
     System.out.println("Car stopped.");
 }
}

//Concrete class extending abstract class
class Tesla extends Car {
 // Providing implementation for abstract method
 @Override
 void start() {
     System.out.println("Tesla starts with a push button.");
 }
}

//Main class
public class CarDriver {
 public static void main(String[] args) {
     Car myCar = new Tesla(); // Allowed (Parent reference, child object)
     myCar.start(); // Calls the overridden method in Tesla
     myCar.stop();  // Calls the concrete method from Car class
 }
}


