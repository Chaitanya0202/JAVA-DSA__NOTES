package classObjectPractice;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.show();
		
		Student s2 = new Student(12,"Shubham","Mumbai");
		s2.show();
		Student s3 = new Student(1,"Sham","GOA");
		s3.show();
	}
	
}
