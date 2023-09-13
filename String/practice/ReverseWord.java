package practice;

public class ReverseWord {

	String reverseStringWord(String str) {
		String wordarr[] = str.split(" ");
		String revWord = null;
		String revString = "";
		for(int i=0; i<=wordarr.length-1; i++) {
			String word = wordarr[i];
			char warr[] = word.toCharArray();
			char revwarr[] = new char[warr.length];
			int j = revwarr.length-1;
			for(int k=0; k<=warr.length-1; k++) {
				revwarr[j] = warr[k];
				j--;
			}
			revWord = new String(revwarr);
			revString = revString + revWord + " ";
		}
		return revString;
	}
}
