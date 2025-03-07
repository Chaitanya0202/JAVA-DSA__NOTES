package string;

public class StringBuilders {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		//apend
		sb.append(" world");
		
//		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("world"));;
		//set
		sb.insert(0, "po");
		System.out.println(sb.reverse());
		//substring
		
		System.out.println(sb.substring(2,6));
		sb.delete(2, 6);
		System.out.println(sb);
		
	}
	
}
