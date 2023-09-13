package stringPrograms;

import java.util.Scanner;

public class UnicodePrinter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scanner.next();

		ConvertCharacters characters = new ConvertCharacters();
		characters.printUnicode(str);
	}
}
class ConvertCharacters {
	void printUnicode(String str) {
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			int unicode = (int) c;
			System.out.println("UniCode for "+c+" = "+unicode);
		}
	}
}
