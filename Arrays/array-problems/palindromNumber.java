package arr;

public class palindromNumber {
	public static void main(String[] args) {
		int []a= {12321,153,45,121};
		for(int i=0;i<a.length;i++) {
			if(isPalindromNumber(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	public static boolean isPalindromNumber(int num) {
		int temp=num;
		int digit=0;
		int res=0;
		while(temp!=0) {
			digit=temp%10;
			temp/=10;
			res=res*10+digit;
		}
		if(res==num) {
			return true;
		}
		return false;
	}
}
