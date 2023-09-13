package stringReversePalindromeorNot;

import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scanner.next();
		scanner.close();
		StringPalindrome palin = new StringPalindrome();
		boolean res = palin.isPalindrome(str);
		if(res == true)
			System.out.println("Palindrome");
		else 
			System.out.println("Not palindrome");
	}
	public boolean isPalindrome(String str) {
		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length];
		int j = arr2.length-1;
		for(int i=0; i<=arr1.length-1; i++) {
			arr2[j] = arr1[i];
			j--;
		}
		String str2 = new String(arr2);
		if(str.equalsIgnoreCase(str2)) {
			return true;
		} else {
			return false;
		}
	}
}
