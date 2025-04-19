package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	private  String name;
	private int marks;
	
	//constructor
	public Student(String name, int marks) {
		this.marks=marks;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}			
}


public class StudentExammple {
	public static void main(String[] args) {
		List<Student>list = new ArrayList<Student>();
		list.add(new Student("Suresh", 34));
        list.add(new Student("Ramesh", 91));
        list.add(new Student("Amit", 91));
        list.add(new Student("Priya", 88));
        
//         *sort by marks [lambda]
//         Collections.sort(list,(a,b)->a.getMarks()- b.getMarks());
//         list.forEach(System.out::println);
        
//			*sort by name alphabate if same marks[lambda]        	
        Collections.sort(list,(a,b)->{
            if (a.getMarks() == b.getMarks()) {
            	return a.getName().compareTo(b.getName()); 
            }
            else {
                return Integer.compare(a.getMarks(), b.getMarks()); // compare marks
            }
        });
        list.forEach(System.out::println);
        
//			* using Comparing Method *                             
//         list.sort(Comparator.comparing(Student::getMarks));
//         list.forEach(System.out::println);
        
//         *sort by name alphabate if same marks
//         list.sort(Comparator.comparing(Student::getMarks).thenComparing(Student::getName));
//         list.forEach(System.out::println);
        
//        for(int i=0;i<list.size();i++) {
//        	System.out.print(" "+ list.get(i));
//        	System.out.println();
//        }
	}

}
