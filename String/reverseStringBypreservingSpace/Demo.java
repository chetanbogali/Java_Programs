package reverseStringBypreservingSpace;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		System.out.println("Before Reversing String ");
		System.out.println(str);
//		ReverseString reverseString = new ReverseString();
//		reverseString.reverse(str);
		
		Reverse reverse = new Reverse();
		String res = reverse.stringReverse(str);
		System.out.println("After Reversing String ");
		System.out.println(res);
	}
}
