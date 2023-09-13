package reverseStringBypreservingSpace;

public class ReverseString {

	void reverse(String str) {
		char []arr = str.toCharArray();
		char rev[] = new char[arr.length];
		int j = rev  .length-1;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] == ' ') {
				rev[i] = ' ';
			}
		}
		for(int i=0; i<=rev.length-1; i++) {
			if(arr[i] == ' ') {
				i++;
			}
			if(rev[i] == ' ') {
				j--;
			}
			rev[i] = arr[j];
			j--;
		}
		str = new String(rev);
		System.out.println(str);
	}
}