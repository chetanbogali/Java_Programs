package stringPrograms;

import java.util.Scanner;

public class UpperLowerConverter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		UpperLowerConverter up = new UpperLowerConverter();
		int res = up.lowerCase(str);
		int res2 = up.upperCase(str);
		System.out.println("Lower Case: "+res);
		System.out.println("Upper Case: "+res2);
	}
	int lowerCase(String str) {
		int lower = 0;
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				lower++;
			}
		}
		return lower;
	}
	int upperCase(String str) {
		int lower = 0;
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				lower++;
			}
		}
		return lower;
	} 
	
}
