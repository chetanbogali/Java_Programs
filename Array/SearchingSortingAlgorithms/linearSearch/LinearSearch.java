package linearSearch;

import java.util.Scanner;

public class LinearSearch {
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
		LinearSearch linearSorting = new LinearSearch();
		linearSorting.search(arr, key);
	}
	void search(int []arr, int key) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] == key) {
				System.out.println("key found at index "+i);
				return;
			}
		}
		System.out.println("Key Not Found");
	}
}
