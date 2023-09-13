package displayAllSubstringsOfGivenString;

import java.util.Scanner;

public class DisplayAllSubstringsOfGivenString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		DisplaySubstrings substrings = new DisplaySubstrings();
		substrings.substring(str);
	}
}
