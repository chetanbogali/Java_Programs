package com.Konest.Arrays.SearchingSorting;

import java.util.Scanner;

public class SortingApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int []arr = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array elements Before sorting");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("1----> BUBBLE SORT");
		System.out.println("2----> SELECTION SORT");
		System.out.println("3----> INSERTION SORT");
		System.out.println("any other ----> SELECTION SORT");
		int choice = scan.nextInt();
		SearchingSortingTechniques searchingSortingTechniques = new SearchingSortingTechniques();
		switch (choice) {
		case 1: searchingSortingTechniques.bubbleSortSearching(arr);
				break;

		case 2: searchingSortingTechniques.selectionSortSearching(arr);
				break;

		case 3: searchingSortingTechniques.insertionSortSearching(arr);
				break;

		default: searchingSortingTechniques.selectionSortSearching(arr);
				break;
		}
		System.out.println("Array elements After sorting");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter key to Search Using Binary Search");
		int key = scan.nextInt();
		scan.close();
		int res = searchingSortingTechniques.binarySearch(arr, key);
		if(res >= 0) {
			System.out.println("Key Found At Index : "+res);
			return;
		} else {
			System.out.println("Key Not Found");
		}
	}
}
