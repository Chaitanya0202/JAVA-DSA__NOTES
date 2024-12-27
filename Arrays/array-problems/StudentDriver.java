package arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDriver  {
	private static final int age = 0;

	public static void main(String[] args) {
//		Comparator<Student>s=new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.age>o2.age) {
//					return 1;
//				}
//				else {
//					return -1;
//				}
//			}
//		};

		List<Student> std = new ArrayList<Student>();
		std.add(new Student(1, "horry", 21));
		std.add(new Student(2, "torry", 43));
		std.add(new Student(3, "gorry", 25 ));

//		Collections.sort(std, s);
		for (Student a : std) {
			System.out.println(a);
		}
	}

	public int compareTo(Student o) {
		if (this.age > o.age) {
			return 1;

		}
		return -1;
		
	}

}
