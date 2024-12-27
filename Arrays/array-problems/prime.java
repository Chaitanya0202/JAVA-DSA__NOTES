package arr;

public class prime {
	public static void main(String[] args) {
		int [] arr= {2,5,8,3,13,22,15,9,2,7};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("Total Prime Number  Array Is :"+count);
	}
	public static boolean isPrime(int num) {

		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
