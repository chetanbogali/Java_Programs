package binarySearch;

import java.util.Scanner;

public class Approach2 {

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
		Approach2 ap2 = new Approach2();
		int res = ap2.search(arr, key);
		if(res > 0) {
			System.out.println("Key found at index "+res);
		} else {
			System.out.println("Key Not Found");
		}
	}
	int search(int []arr, int key) {
		int low = 0;
		int high = arr.length-1;
		while(low < high) {
			int mid = (low + high)/2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key > arr[mid] ) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
