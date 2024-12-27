package arr;

public class Student {
	int id;
	String name;
	int age;
	public Student(int i, String name, int age) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=name;
		this.age=age;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "CompareTo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
