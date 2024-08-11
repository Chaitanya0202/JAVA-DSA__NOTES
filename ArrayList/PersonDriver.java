package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PersonDriver {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Chetan", 23, 23000.00));
		persons.add(new Person("Sacin", 24, 6767.00));
		persons.add(new Person("Ravi", 25, 15000.00));
		persons.add(new Person("Amit", 22, 12000.00));

		System.out.println(persons);

//		get object based on Index
		System.out.println(persons.get(1));
		System.out.println(persons.get(1).name);

		// Sorting the ArrayList based on the age of Person objects
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.age, p2.age);
			}
		});

//		Iterate
		for (Person p : persons) {
			System.out.println(p);
		}
		
		
//		Iterate using Iterator 
		Iterator<Person>p=persons.iterator();
		
		while(p.hasNext()) {
			Person person=p.next();
			System.out.println("Name: " + person.name + ", Age: " +person.age + ", Salary: " + person.salary);
		
		}
		

	}
}
