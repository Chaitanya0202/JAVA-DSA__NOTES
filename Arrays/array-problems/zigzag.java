package arr;

public class zigzag {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,3};
		int [] b= {6,7,8,9,0};
		int [] c=new int [a.length+b.length];
		
		int i=0;
		for(int j=0;j<c.length;i++) {
			if(i<a.length && i<b.length) {
				c[j]=a[i];
				c[j+1]=b[i];
				j=j+2;				
			}
			else {
				if(a.length>b.length) {
					c[j]=a[i];
					j++;
				}
				else {
					c[j]=b[i];
					j++;
				}
				
			}
		}
		for(int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}
	}
}
