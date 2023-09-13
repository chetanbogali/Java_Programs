package selectionSorting;

public class Sort {

	void sortingLogic(int []arr) {
		int min;
		int pos;
		int help;
		for(int i=0; i<=arr.length-2; i++) {
			// Assuming arr[i] fist value as minimum
			min = arr[i];
			pos = i;
			for(int j=i+1; j<=arr.length-1; j++) {
				// checking is arr[j] value lesser than min: if true give arr[j] value to min & its index value to post
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
}
