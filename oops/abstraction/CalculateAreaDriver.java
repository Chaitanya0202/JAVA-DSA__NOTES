package abstraction;



abstract class CalculateArea {

	//public static final double r=23;
	
	public void abc() {
		System.out.println(" Concrit Method");
	}
	
	// abstract Method
	abstract void makeCalculate(int r);
}

class CalImpl extends CalculateArea{
	void makeCalculate(int r) {
		System.out.println("Area of Circle "+ Math.PI*r*r);
	}
	
}

public class CalculateAreaDriver{
	public static void main(String[] args) {
		CalculateArea ca =new CalImpl();
		ca.makeCalculate(23);
	}
	
}
