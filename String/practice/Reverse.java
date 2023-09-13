package practice;

public class Reverse {

	String stringReverse(String str){
		char arr[] = str.toCharArray();
		char revarr[] = new char[arr.length];
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] == ' ') {
				revarr[i] = arr[i];
			}
		}
		
		int j = revarr.length-1;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] != ' ') {
				if(revarr[j] == ' ') {
					j--;
				}
				revarr[j] = arr[i];
				j--;
			}
		}
		str = new String(revarr);
		return str;
	}
}
