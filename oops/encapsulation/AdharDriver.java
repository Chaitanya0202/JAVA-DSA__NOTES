package encapsulation;

public class AdharDriver {
	public static void main(String[] args) {
		Adhar a1=new Adhar("chetan",87430828,"pune",0107,1234);
		a1.details("chetan", 87430828);
		
		a1.setpin(87430828, 1234, 4321);
		
		a1.setadd(87430828,4321,"pune","goa");
	}
}