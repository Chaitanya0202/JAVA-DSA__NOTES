package encapsulation;

public class Adhar {
	private String name;
	private long number;
	private String add;
	private double DOB;
	private int pin;
	
	
	public String getname() {
		return name;
	}
	public long getnumber() {
		return number;
	}
	public String getadd() {
		return add;
	}
	public double getDOB() {
		return DOB;
	}
	public int getpin() {
		return pin;
	}
	
	
	public void setpin(long number,int oldPin,int newpin) {
		if(this.number==number && this.pin==oldPin) {
			pin=newpin;
		}
		System.out.println("Pin is Updated");
		System.out.println("Pin is Updated"+pin);
	} 
	
	public void details(String name,long number) {
		if(this.name==name && this.number==number) {
			System.out.println("name:"+ name);
			System.out.println("number :"+number);
			System.out.println("add:"+add);
			System.out.println("pin:"+pin);
		}
		else {
			System.out.println("Enter the valid number");
		}
	}
	
	public void setadd(long number,int pin,String oldAdd,String newAdd) {
		if(this.number==number && this.pin==pin) {
			add=newAdd;
			System.out.println("Address has been Updated");
			System.out.println("as :"+add);
		}
		else {
			System.out.println("Enter valid rediantial");			
		}
	}
	
	public Adhar(String name, long number, String add, double dOB, int pin) {
		super();
		this.name = name;
		this.number = number;
		this.add = add;
		this.DOB = dOB;
		this.pin=pin;
	}
	
	
	
}
