package reverseWordsInString;

public class ReversingWords {

	String revreseWord(String str) {
		// first: split the string, ==> return the string array
		String wordarr[] = str.split(" ");
		String revreseWord = null;
		String revrseString = "";
		for(int i=0; i<=wordarr.length-1; i++) {
			// Convert string <== array of string
			String word = wordarr[i];
			// Convert char array <== string
			char warr[] = word.toCharArray();
			char revwarr[] = new char[warr.length];
			
			// Reverse the String 
			int j = revwarr.length-1;
			for(int k=0; k<=warr.length-1; k++) {
				revwarr[j] = warr[k];
				j--;
			}
			// convert string <== char array
			revreseWord = new String(revwarr);
			revrseString = revrseString + revreseWord + " ";
		}
		return revrseString;
	}
}