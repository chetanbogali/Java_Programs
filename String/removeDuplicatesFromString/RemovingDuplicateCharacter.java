package removeDuplicatesFromString;

import java.util.Scanner;

public class RemovingDuplicateCharacter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		
		RemoveDuplicateCharacter dup = new RemoveDuplicateCharacter();
		String res = dup.Duplicate(str);
		System.out.println(res);
	}
}
