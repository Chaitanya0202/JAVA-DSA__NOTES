package arr;

public class prime11 {
	public static void main(String[] args) {
		int num=5;
		int []arr= {7,6,5,13};
		
		for(int j=0;j<arr.length;j++) {
			
			for(int i=2;i<arr[j]/2;i++) {
				
				if(arr[j]%i==0) {
				}
				else {
					System.out.println(arr[j]);
					break;
				}
			}
		}
	}
}
