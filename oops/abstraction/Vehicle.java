package abstraction;
// abstract Class
 abstract class Vehicle {
	abstract void start(); // Abstract Method

    void stop() {          // Concrete Method
        System.out.println("Vehicle has stopped.");
    }

}
