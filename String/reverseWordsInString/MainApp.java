package reverseWordsInString;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		ReversingWords reversingWords = new ReversingWords();
		String res = reversingWords.revreseWord(str);
		System.out.println(res);
	}
}
