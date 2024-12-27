package arr;

public class Patterns {
	public static void main(String[] args) {
		String inputString = "hellofromotherside";
		int rows = 12;
		int columns = 3;

		// Print the pattern
		int ab = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					if (i < 3) {
						System.out.print(inputString.charAt(ab));
						ab++;
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			for (int l = 0; l < 3; l++) {
				if ((i == 3 && l == 1) || (i == 1 && l == 0)) {

					System.out.print(inputString.charAt(ab));
					ab++;
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

//		for (int k = 0; k < 3; k++) {
//			for (int l = 0; l < 3; l++) {
//				if ((k == 0 && l == 1) || (k == 1 && l == 0)) {
//
//					System.out.print(inputString.charAt(ab));
//					ab++;
//				} else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
	}
}
