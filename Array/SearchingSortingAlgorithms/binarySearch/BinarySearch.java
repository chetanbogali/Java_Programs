package binarySearch;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int []arr = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter key to Search");
		int key = scan.nextInt();
		scan.close();
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.search(arr, key);
	}
	void search(int []arr, int key) {
		int low = 0;
		int high = arr.length-1;
		for(int i=0; i<=arr.length-1; i++) {
			int mid = (low + high)/2;
			if(key == arr[mid]) {
				System.out.println("Key found at index "+mid);
				return;
			}
			else if(key > arr[mid] ) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		System.out.println("Key Not Found");
	}
}
