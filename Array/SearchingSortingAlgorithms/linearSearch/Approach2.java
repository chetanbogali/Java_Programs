package linearSearch;

import java.util.Scanner;

public class Approach2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
		int []arr = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter key to Search");
		int key = scan.nextInt();
		scan.close();
		Approach2 ap2 = new Approach2();
		int res = ap2.search(arr, key);
		if(res > 0) {
			System.out.println("key found at index "+res);
		} else {
			System.out.println("Key Not Found");
		}
	}
	int search(int []arr, int key) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
