package arr;

public class removeElement {
	public static void main(String[] args) {
		
		int [] a= {1,3,5,2,5,2};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
