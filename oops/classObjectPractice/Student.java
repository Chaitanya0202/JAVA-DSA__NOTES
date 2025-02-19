package classObjectPractice;

public class Student {
	int studentId;
	String name;
	String city;
	
	
	public void show() {
		
		System.out.println("Show Method Called");
		
		System.out.println(" ID:"+this.studentId+" name: "+this.name+" city: "+this.city);
	}
	// NON PARAMETRISED  CONSTRUCTOR
	public Student() {
		// Constructor chainning
		this(5,"Ramesh","Kolkata");
		
	}
	// this keyword used for intitialize the 
	// global value with current invoking object values
	public Student( int studentId,String name, String city) {
		this.studentId=studentId;
		this.name=name;
		this.city=city;
	}
	// Constructor Overloading - creating more than
	// one constructor in same class  with different formal agruments
	

	public Student (int a) {
		
	}
	
	
}
