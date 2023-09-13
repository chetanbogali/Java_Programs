package selectionSorting;

import java.util.Scanner;

public class SelectionSortingApp {

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
		Sort sort2 = new Sort();
		sort2.sortingLogic(arr);
		System.out.println("Array elements After Sortig ");
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}

}
