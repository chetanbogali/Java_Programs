package replaceSpaceWtih99;

import java.util.Scanner;

public class ReplaceSpaceWith99 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		
		Replace replace = new Replace();
		String res = replace.replaceSpace(str);
		System.out.println(res);
	}
}
