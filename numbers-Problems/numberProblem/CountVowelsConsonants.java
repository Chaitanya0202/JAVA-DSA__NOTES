package numberProblem;

public class CountVowelsConsonants {
	public static String check(char ch) {
		if(ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'|| ch=='o'|| ch=='O'||ch=='u'|| ch=='U') {
			return "Vowel";
		}
		else if((int)ch>65 && (int)ch<90 || (int)ch> 97 && (int)ch<122  ) {
			
			return "Consent";
		}
		else {
			return "";
		}
	}
	
	public static void main(String[] args) {
		String s="Hello9";
		
		for(int i=0 ;i<s.length();i++) {
			if(check(s.charAt(i))=="Vowel") {
				System.out.println(s.charAt(i)+" is "+ " Vowel");
			}
			else if(check(s.charAt(i))=="Consent") {
				System.out.println(s.charAt(i)+" is "  + " Consent");
			}
			else {
				System.out.println("Symbol");
			}
		}
	}
}
