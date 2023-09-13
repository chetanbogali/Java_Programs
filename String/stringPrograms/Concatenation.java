package stringPrograms;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String str1 = scanner.next();
		String str2 = scanner.next();

		ConcatinatingStrings concatinatingStrings = new ConcatinatingStrings();
		String res = concatinatingStrings.concate(str1, str2);

		if(res != null) {
			System.out.println(res);
		}
		else {
			System.out.println("Strings are not Equal");
		}
	}
}
