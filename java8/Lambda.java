package java8;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		
		 List<String> names = Arrays.asList("John", "Alice", "Bob");

	        // Using lambda to iterate
	        names.forEach(name -> System.out.println(name));
		
		
		//we are using Thread for better understanding,
		// runnable interface is the functional interface becouse
		//its having only one abstract method-->run()
		//overrifing run method
		// without using lambda
		Runnable task1= new Runnable() {
			public void run() {
				System.out.println("Task 1 is Starting...");
			}
		};// here semicolon is Important
		new Thread(task1).start();
		
		//with using lambd ex..
		Runnable task2=()->System.out.println("Task 2 started...");
		new Thread(task2).start();
	}
	
}
