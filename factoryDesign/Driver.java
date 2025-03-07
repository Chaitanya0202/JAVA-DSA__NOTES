package factoryDesign;

public class Driver {

	public static void main(String[] args) {
		
		Employee employee=EmployeeFactory.getEmployee("Web Developer");
		Employee employee2=EmployeeFactory.getEmployee("Android Developer");
		employee.salary();
		employee2.salary();
	}
}
/*
Note-1. Factory Design pattern Used  to create object withouth exposing to the client
 	2.instead of createing object using new keyword
 	through EmployeeFactory static method we are creating object.
	3. its Makes app Rebust .


 * 
 * */

