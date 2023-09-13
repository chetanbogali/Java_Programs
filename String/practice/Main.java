package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		
		Reverse reverse = new Reverse();
		String res = reverse.stringReverse(str);
		System.out.println(res);
	}

}
