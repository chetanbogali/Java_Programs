package stringPrograms;

import java.util.Scanner;

public class Solution2ULCount {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		Solution2ULCount thecount = new Solution2ULCount();
		thecount.UpperLowerCount2(str);
	}
	void UpperLowerCount2(String str) {
		int ucount = 0;
		int lcount = 0;
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				lcount++;
			} else {
				ucount++;
			}
		}
		System.out.println("LOWER CASE COUNT= "+lcount);
		System.out.println("LOWER CASE COUNT= "+ucount);
	}

}
