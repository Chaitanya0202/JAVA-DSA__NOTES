package InterFace;

//Interface --> Pure Abstraction
//allows only Abstract Method
// can`t create object of Interface
// for that implements and inharit the create object of
// inherited class
// neccessory give implements/body for all abstract method 
// 
interface Vehicle {
 void start();  // Abstract method (no implementation)
}

//Implementing the interface
class Bike implements Vehicle {
 @Override
 public void start() {
     System.out.println("Bike starts with a kick.");
 }
}

//Implementing another class with the same interface
class Car implements Vehicle {
 @Override
 public void start() {
     System.out.println("Car starts with a key.");
 }
}

//Main class
public class VehicleDriver {
 public static void main(String[] args) {
//	 upcasting
     Vehicle myBike = new Bike();
     myBike.start(); // Calls start method of Bike

     Vehicle myCar = new Car();
     myCar.start(); // Calls start method of Car
 }
}


