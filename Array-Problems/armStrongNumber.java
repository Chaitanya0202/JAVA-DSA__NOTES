package arr;

public class armStrongNumber {
	public static void main(String[] args) {
		int []a= {1,153,370,371,87,121};
		for(int i=0;i<a.length;i++) {
			if(isArmstrong(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	public static boolean isArmstrong(int num) {
		int temp=num;
		int temp2=num;
		int digit=0;
		
		int res2=0;
		int count=0;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		while(temp2!=0) {
			digit=temp2%10;
			int res=1;
			for(int i=0;i<count;i++) {
				res=res*digit;
			}
			res2=res2+res;
			temp2/=10;
		}
		if(res2==num) {
			return true;
		}
		return false;
	}
}
