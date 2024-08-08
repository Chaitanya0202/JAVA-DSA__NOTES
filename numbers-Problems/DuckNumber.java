package numbers;

public class DuckNumber {
// Duck - A Positive Integer Contains At least One 0 But not at the 
//	beggineing 
	public static void main(String[] args) {
		int num=3210;
		if(isDuck(num) ) {
			System.out.println("Duck Number");
		}else {
			System.out.println("Not Duck Number");
		}
		
	}
	public static boolean isDuck(int num) {
		// logic for checking positive num and first digit should 0
		String str=String.valueOf(num);
		if(num<0 && str.charAt(0)=='0') {
			return false;
		}
		// contains at least one 0
		int count=0;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				count++;
			}
		}
		if(count>0) {
			return true;			
		}else {
			return false;
		}
		
	}
}
