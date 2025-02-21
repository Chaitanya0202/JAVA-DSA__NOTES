package numberProblem;

public class StringPalimdrom {

	public static void main(String[] args) {
		String str="madam";
		// Using StringBuilder
		String reversed=new StringBuilder(str).reverse().toString();
		if(str.equals(reversed)) {
			System.out.println("Pallimdrom");
		}
		else {
			System.out.println("Not Palimdrom");
		}
		
		
	}
}
