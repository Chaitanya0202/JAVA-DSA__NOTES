package numbers;

public class SunnyNumber {
// a number N will be a sunny number if N+1 is a perfect square.
//	ex  3 8 15 24 35 48 63 80 99
	public static void main(String[] args) {
		int num=8;
		int sq=(num+1)*(num+1);
//		System.out.println(sq); //81
		double sq_root=Math.sqrt(sq);
//		System.out.println(sq_root); // 9.0
		if(sq_root-Math.floor(sq_root)==0) {
			System.out.println("SUNNY NUMBER");
		}
		else {
			System.out.println("NOT SUNNY NUMBER");
		}
	}
}
