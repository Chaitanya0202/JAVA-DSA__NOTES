package arr;
import java.util.Arrays;
public class positive {
	public static void main(String[] args) {
		int a[]= {-1,2,1,-2,3,-3,4};
		int temp[]=new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
//					 temp=a[j];
					a[j]=a[j+1];
//					a[j+1]=temp ;
				}
				temp[i]=a[j];
			}
		}
		for(int i=0;i<temp.length/2;i++)
		{
			if(temp[i]<temp[i+1])
			{
		
					int temp1 =temp[i];
					temp[i]=temp[i+1];
					temp[i+1]=temp1;
				}
					
				
			}
		System.out.println(Arrays.toString(a));
	}

}
