package encapsulation;

public class EnCapDriver {
	public static void main(String[]args) {
		//Encap e1=new Encap("ram", 234, "ram@mail");
		
		//System.out.println("hello"+ e1.getEmail());
		//System.out.println(e1.toString());
		int n=10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==n-1&&j==n-1) {
					System.out.print("* ");
					
				} else {
					System.out.print(i);

				}
			}
			System.out.println("  ");
			
		}
	}

}
