package stringPrograms;

import java.util.Scanner;

public class StringLengthChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings ");
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		LengthChecker theChecker = new LengthChecker();
		boolean res = theChecker.checkLength(str1, str2);
		if(res == true)
			System.out.println("Both string are same length");
		else 
			System.out.println("Both strings are of different length");
	}
}
