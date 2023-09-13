package insertionSorting;

import java.util.Scanner;

public class InsertionSorting {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int []arr = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("Array elements Before Sorting");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		InsertionSorting insertionSorting = new InsertionSorting();
		insertionSorting.sort(arr);
		System.out.println("Array elements After Sortig ");
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}
	void sort(int []arr) {
		for(int i=1; i<=arr.length-1; i++) {
			int item = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
	}
}
