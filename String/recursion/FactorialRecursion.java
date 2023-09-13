package recursion;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int res = fact(n);
		System.out.println("Factorial of "+n+" is: "+res);
	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
}
