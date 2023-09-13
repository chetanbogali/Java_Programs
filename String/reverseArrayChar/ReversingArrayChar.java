package reverseArrayChar;

import java.util.Scanner;

public class ReversingArrayChar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char arr[] = new char[10];
		System.out.println("Enter characters");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scanner.next().charAt(0);
		}
		scanner.close();
		System.out.println("First Array Contents Are..");
		for (char x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		char arr2[] = new char[10];
		for(int i=0; i<=arr.length-1; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("Second Array Contents Are..");
		System.out.println("Before Reversing");
		for (char ch : arr2) {
			System.out.print(ch+" ");
		}
		char arr3[] = new char[10];
		// REVERSING LOGIC
		int j = arr3.length-1;
		for(int i=0; i<=arr2.length-1; i++) {
			arr3[j] = arr2[i];
			j--;
		}
		System.out.println();
		System.out.println("Third Array Contents Are..");
		System.out.println("After Reversing");
		for (char ch3 : arr3) {
			System.out.print(ch3+" ");
		}
	}

}
