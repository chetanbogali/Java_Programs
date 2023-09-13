package com.Konest.Arrays.SearchingSorting;

public class SearchingSortingTechniques {

	int linearSearch(int []arr, int key) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	int binarySearch(int []arr, int key) {
		int low = 0;
		int high = arr.length-1;
		for(int i=0; i<=arr.length-1; i++) {
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
	void bubbleSortSearching(int []arr) {
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
	void selectionSortSearching(int []arr) {
		int min;
		int pos;
		int help;
		for(int i=0; i<=arr.length-2; i++) {
			// Assuming arr[i] fist value as minimum
			min = arr[i];
			pos = i;
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			// swapping
			help = arr[i];
			arr[i] = arr[pos];
			arr[pos] = help;
		}
	}
	void insertionSortSearching(int []arr) {
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
