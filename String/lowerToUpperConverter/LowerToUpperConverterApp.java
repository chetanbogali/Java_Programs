package lowerToUpperConverter;

import java.util.Scanner;

public class LowerToUpperConverterApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		
		LowToUpConverter converter = new LowToUpConverter();
		String res = converter.lowToUp(str);
		System.out.println(res);
	}
}
