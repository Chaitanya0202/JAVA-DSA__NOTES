package Arrays;

public class MIssingElement {
	//missing sinle value
	
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,6,7};
		int n=arr.length+1;
		int expextedSum=n*(n+1)/2;
		int actualSum=0;
		for(int x:arr) {
			actualSum+=x;
		}
		System.out.println("Missing Elements :"+(expextedSum-actualSum));
	}

}
