package bubbleSorting;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
		int []arr = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("Array Elements Before sorting");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		BubbleSorting bubbleSorting = new BubbleSorting();
		bubbleSorting.sort(arr);
		System.out.println();
		System.out.println("Array Elements After sorting");
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}
	void sort(int []arr) {
		for(int i=0; i<=arr.length-2; i++) {
			for(int j=0; j<=arr.length-2-i; j++) {
				if(arr[j] > arr[j+1]) {
					int help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
	}
}
