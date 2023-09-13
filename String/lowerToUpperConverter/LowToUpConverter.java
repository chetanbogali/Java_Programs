package lowerToUpperConverter;

public class LowToUpConverter {

	String lowToUp(String str) {
		
		char arr[] = str.toCharArray();
		for(int i=0; i<=arr.length-1; i++) {
			if(Character.isUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]);
			}
		}
		return new String(arr);
	}
}
