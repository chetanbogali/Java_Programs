package practice;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String");
		String str = scan.nextLine();
		
		ReverseWord reverseword =  new ReverseWord();
		String res = reverseword.reverseStringWord(str);
		System.out.println(res);
	}
}
