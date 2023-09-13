package stringPrograms;

import java.util.Scanner;

public class UpperToLowerConverter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		for(int i=0; i<=str.length()-1; i++) {
			String lower = str.toLowerCase();
			System.out.println(lower);
		}
	}
	
//	public void lowerToUpperConverter(String str) {
//		for(int i=0; i<=str.length()-1; i++) {
//			String lower = str.toLowerCase();
//			System.out.println(lower);
//		}
//	}
}
