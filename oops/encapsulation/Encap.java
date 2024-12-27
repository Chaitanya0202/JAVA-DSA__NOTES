package encapsulation;

public class Encap {
	String name;
	int rollNo;
	String email;
	public Encap(String name, int rollNo, String email) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Encap [name=" + name + ", rollNo=" + rollNo + ", email=" + email + "]";
	}
	

}
