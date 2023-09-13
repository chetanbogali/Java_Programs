package stringPrograms;

import java.util.Scanner;

public class UpperLowerCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		ULCount ul = new ULCount();
		ul.UpperLowerCount(str);
	}

}
