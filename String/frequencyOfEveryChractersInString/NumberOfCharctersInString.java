package frequencyOfEveryChractersInString;

import java.util.Scanner;

public class NumberOfCharctersInString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		CharactersCount cc = new CharactersCount();
		cc.count(str);
		
	}
}
